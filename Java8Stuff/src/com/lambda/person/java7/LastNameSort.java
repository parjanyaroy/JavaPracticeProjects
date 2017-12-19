package com.lambda.person.java7;

import java.util.Comparator;

public class LastNameSort implements Comparator<Person> {
	
	
	public int compare(Person arg0, Person arg1) {
		String firstArg = arg0.getLastName();
		String secondArg = arg1.getLastName();
		return firstArg.compareTo(secondArg)==0?arg0.getFirstName().compareTo(arg0.getFirstName()):firstArg.compareTo(secondArg);
		
	}

}
