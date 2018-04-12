package com.pj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		//List<Integer> myList = new CopyOnWriteArrayList<>();
		List<String> myList = new ArrayList<>();
		for (int i = 1; i < 10; i++)
			myList.add(i+"");
		
		new Thread(new Runnable() {
			public void run() {
				Iterator<String> i1 = myList.iterator();
				while (i1.hasNext()) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
					System.out.println("T1->" + i1.next());
					//i1.remove();
				}
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				myList.remove(4);
				System.out.println("T2->" +myList);

			}
		}).start();
		
		System.out.println("-----------TESTING LIST ITERATOR-----------------");
		ListIterator<String> iList = myList.listIterator();
		while(iList.hasNext()){
			String x=iList.next();
            System.out.println(x);
            if(x.equalsIgnoreCase("2"))
            {
            iList.set("14");
            }
            
        }
		System.out.println("---------");
        System.out.println("Elements in backward directiton");
        while( iList.hasPrevious()){
            System.out.println((iList).previous());
        }
			

	}
	
	

}
