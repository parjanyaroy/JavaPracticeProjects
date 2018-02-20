package com.pj.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// Look into the internal structure of hashmap , concurrent hashmap after
// initialization . Observe rehashing process
public class HashingDemo {

	public static void main(String[] args) {
		
		HashMap<Customer, Integer> hm1 = new HashMap<>(5,0.3F);
		Customer c1 = new Customer("ABC", "B"); 
		Customer c2 = new Customer("XYZ", "F"); 
		Customer c3 = new Customer("PQR", "F"); 
		Customer c4 = new Customer("RST", "A");	
		Customer c5 = new Customer("EFG", "Z");
		Customer c6 = new Customer("FDC", "Z"); 
		Customer c7 = new Customer("JFN", "Z"); 
		Customer c8 = new Customer("TLD", "Z"); 
		Customer c9 = new Customer("OTG", "Z"); 
		Customer c10 = new Customer("OTE", "Z"); 
		Customer c11 = new Customer("YEM", "Z"); 
		Customer c12 = new Customer("NDT", "Z"); 
		Customer c13 = new Customer("OE3", "Z");
		Customer c14 = new Customer("DNE", "Z");
		
		
		hm1.put(c1,1);
		hm1.put(c2,2);
		hm1.put(c3,3);
		hm1.put(c4,4);
		hm1.put(c5,5);
		hm1.put(c6,6);
		hm1.put(c7,7);
		hm1.put(c8,8);
		hm1.put(c9,9);
		hm1.put(c10,10);
		hm1.put(c11,11);
		hm1.put(c12,12);
		hm1.put(c13,13);
		hm1.put(c14,14);
		
		Iterator i1 = hm1.keySet().iterator();
		while(i1.hasNext())
		{
			Customer  key =  (Customer) i1.next();
			System.out.println(hm1.get(key));
//			/System.out.println();
		}
		System.out.println("--------------------------------------");
		Iterator i2 = hm1.entrySet().iterator();
		while(i2.hasNext())
		{
			Map.Entry<Customer, Integer> entry = (Entry<Customer, Integer>) i2.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		

	}

}
