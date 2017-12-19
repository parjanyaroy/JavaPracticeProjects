package com.lambda.person.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonTest {
	public static void main(String[] args) {
		List<Person> l1 = Arrays.asList(new Person("Parjanya","Roy",26),new Person("Pratik","Saha",27),new Person("Rohit","Bag",25),new Person("Suchandra","Roy",21));
		//1> Sort List By Last Name
		Collections.sort(l1,new LastNameSort());
		//2> Print All Elements In The List
		for(Person p : l1)
			System.out.println(p.toString());
		System.out.println("---------------");
		//3> Create method to print all names equal and above 26
		for(Person p : l1)
			if(p.getAge()>=26)
			System.out.println(p.toString());
	}
}
