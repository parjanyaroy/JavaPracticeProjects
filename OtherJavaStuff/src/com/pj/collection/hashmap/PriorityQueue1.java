package com.pj.collection.hashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class PriorityQueue1 {
	
	Queue<Customer> pq1 = new PriorityQueue();
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("ABC", "B"); // 4
		Customer c2 = new Customer("XYZ", "F"); // 2
		Customer c3 = new Customer("PQR", "F"); // 3
		Customer c4 = new Customer("RST", "A");	// 5
		Customer c5 = new Customer("EFG", "Z"); // 1
		PriorityQueue1 testQueue = new PriorityQueue1();
		testQueue.pq1.offer(c1);
		testQueue.pq1.offer(c2);
		testQueue.pq1.offer(c3);
		testQueue.pq1.offer(c4);
		testQueue.pq1.offer(c5);
		Iterator itr = testQueue.pq1.iterator();
		while(itr.hasNext())
		{
			Customer c = (Customer)itr.next();
			System.out.println(c.getName());
		}
		System.out.println("---------------------------");
		while(!testQueue.pq1.isEmpty())
		System.out.println(testQueue.pq1.poll().getName());
		// Order Of Printing EFG(Z)->XYZ(F)->PQR(F)->ABC(B)->RST(A)
		Map m1 = new TreeMap<Customer,Integer>();
		m1.put(c1,1);
		m1.put(c2,2);
		m1.put(c4,3);
		Iterator i1 = m1.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.println(((Map.Entry<Customer, Integer>)i1.next()).getKey().toString());
		}
	}
	
	

}
