package com.pj.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetLHashSet {

	 public static void main(String args[]){  
	  //HashSet<String> al=new HashSet<String>();
	  //LinkedHashSet<String> al=new LinkedHashSet<String>();
	  TreeSet<String> al=new TreeSet<String>();
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Parjanya");
	  al.add("Ajay");  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}