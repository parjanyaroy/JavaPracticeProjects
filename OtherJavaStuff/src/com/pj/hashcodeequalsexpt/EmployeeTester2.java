package com.pj.hashcodeequalsexpt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeTester2 {

	public static void main(String[] args) {
		
		
		
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
		System.out.println("----------------------------");
		Map m1 = new HashMap<Employee,Integer>();
		
		m1.put(new Employee("A", 10), 1);
		m1.put(new Employee("B", 15), 2);
		m1.put(new Employee("A", 10), 3);
		
		Iterator<Map.Entry<Employee, Integer>> i1 = m1.entrySet().iterator();
		int i=0;
		while(i1.hasNext())
		{
			i++;
			Map.Entry<Employee,Integer> e1 =(i1.next());
			System.out.println(e1.getKey().toString()+" - "+e1.getValue());
		}
		
		
		
		
		
	}

}
