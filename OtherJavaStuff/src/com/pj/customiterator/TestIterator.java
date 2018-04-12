package com.pj.customiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7));
		MyIterableList<Integer> itrList = new MyIterableList<>(myList,true);
		Iterator<Integer> iterator = itrList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("------------------------------");
		itrList.setEven(false);		
		iterator = itrList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
