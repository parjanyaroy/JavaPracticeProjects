package com.pj.hashcodeequalsexpt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Map m1 = new HashMap<Employee,Integer>();
		
		m1.put(new Employee("A", 10), 1);
		m1.put(new Employee("B", 15), 2);
		m1.put(new Employee("J", 90), 10);
		m1.put(new Employee("K", 100),11);
		m1.put(new Employee("L", 110), 12);
		m1.put(new Employee("L", 110), 12);
		
		// The below line will not work if the hashcode is not overridden
		System.out.println("Employee Code->"+m1.get(new Employee("L", 110)));
		
		Iterator<Map.Entry<Employee, Integer>> i1 = m1.entrySet().iterator();
		int i=0;
		while(i1.hasNext())
		{
			i++;
			Map.Entry<Employee,Integer> e1 =(i1.next());
			//System.out.println(e1.getKey().toString()+" - "+e1.getValue());
		}
		//System.out.println(i);
		
		
		Set<Employee> h1 = new HashSet<Employee>();
		h1.add(new Employee("A", 10));
		h1.add(new Employee("B", 20));
		// below line will add a duplicate if equals is not overridden
		h1.add(new Employee("B", 20));
		// Below line will print false if employee does not override hashcode
		System.out.println(h1.contains(new Employee("B", 20)));
		Iterator i2 = h1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next().toString());
		}
		
		/*
		 * IMPORTANT:: For a hashmap , if you override the hashcode and say always return a same number
		 * and DO NOT OVERRIDE Equals , then all the elements of the hashcode will go to 
		 * the same bucket . And even if a get operation identifies the bucket , It will have
		 * not way to identify the particular object and will return a null value
		 * 
		 *  HASHCODE			EQUALS
		 *  
		 *  HASH MAP 
		 *  --------
		 *  
		 *  YES					YES			Perfect Operation
		 * 	YES					NO			Will locate bucket but wont be able to identify the object.NULL VALUE FOUND FOR GET.DUPLICATE KEY INSERTION
		 *  NO					YES			Wont be able to locate bucket with get opertn.NULL VALUE FOUND
		 *  NO					NO			Wont be able to locate bucket with get opertn.NULL VALUE FOUND
		 *  
		 * HASH SET
		 * --------
		 * 	YES					YES 	Perfect Operation
		 *  YES					NO		Duplicate values can be added in same bucket with chaining 
		 *  NO					YES		.contains() operation will not find the object as bucket cannot be identified DUPLICATE INSERTION
		 *  NO					NO		.contains() operation will not find the object as bucket cannot be identified DUPLICATE INSERTION
		 */
		
		
	}

}
