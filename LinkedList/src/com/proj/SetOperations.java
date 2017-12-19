package com.proj;

import java.util.HashMap;
import java.util.Iterator;

import com.proj.LkdList.Node;

public class SetOperations {

	// Find Union Intersection Difference Of Two Lists
	public static void main(String[] args) {
		int [] arr1 ={1,2,3,4,5};
		LkdList l1 = new LkdList(arr1);
		int [] arr2 ={4,5,6,7,8,9,10};
		LkdList l2 = new LkdList(arr2);
		SetOperations s1 = new SetOperations();
		s1.setOperations(l1.head,l2.head);

	}

	private void setOperations(Node list1, Node list2) {
		HashMap<Integer,Node> mapA = new HashMap<>();
		HashMap<Integer,Node> mapB = new HashMap<>();
		HashMap<Integer,Node> mapInterSection = new HashMap<>();
		Node n1=list1;
		Node n2=list2;
		while(n1!=null)
		{
			mapA.put(n1.data, n1);
			n1=n1.next;
		}
		while(n2!=null)
		{
			Node temp=mapA.get(n2.data);
			if(temp==null)
			{
				mapB.put(n2.data, n2);
			}
			else
			{
				mapInterSection.put(n2.data,n2);
				mapA.remove(n2.data);
			}
			n2=n2.next;
		}
		System.out.println("A-B");
		for (Iterator<Integer> i = mapA.keySet().iterator(); i.hasNext(); ) {
			int key=(int) i.next();
			System.out.println(key);
		}
		System.out.println("AuB");
		for (Iterator<Integer> i = mapInterSection.keySet().iterator(); i.hasNext(); ) {
			int key=(int) i.next();
			System.out.println(key);
		}
		System.out.println("B-A");
		for (Iterator<Integer> i = mapB.keySet().iterator(); i.hasNext(); ) {
			int key=(int) i.next();
			System.out.println(key);
		}
		
		
		
	}
	
	

}
