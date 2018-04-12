package com.pj.lrucache;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LnkdHashMapExp {
	
	public static void main(String[] args) {
		// Setting the below parameter true will order the map according to ACCESS order.
		LinkedHashMap<String, String> map = new LinkedHashMap<>(16, 0.75f, true);
		
		map.put("A", "1");
		map.put("B", "3");
		map.put("C", "3");
		map.put("D", "4");
		map.put("E", "5");
		
		System.out.println(map.get("C"));
		System.out.println(map.get("A"));
		System.out.println("------");
		Iterator i1 = map.entrySet().iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
	}

}
