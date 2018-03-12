package com.pj.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleListDemo{
 public static void main(String args[]){
 
  ArrayList al = new ArrayList();
  al.add("Dinesh");
  al.add("Anamika");
  al.add("Sweety");
  
  al.add(1, "ABC");
  al.set(0, "PJ");
  
  
  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
  System.out.println("------------------------------");
  
  ArrayList al2 = new ArrayList();
  al2.add("Anamika");
  al2.add("Vinesh");

  //al.removeAll(al2);
  al.retainAll(al2);

  itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
  
    

  
 }
}