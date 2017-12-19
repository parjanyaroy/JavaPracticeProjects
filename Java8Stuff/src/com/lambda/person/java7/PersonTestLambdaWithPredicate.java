package com.lambda.person.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PersonTestLambdaWithPredicate {

	public static void main(String[] args) {
		List<Person> l1 = Arrays.asList(new Person("Parjanya", "Roy", 26), new Person("Pratik", "Saha", 27),
				new Person("Rohit", "Bag", 25), new Person("Suchandra", "Roy", 21));

		Comparator<Person> c1 = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		Collections.sort(l1, c1);

		ListTools allNames = (List<Person> list, Predicate<Person> pred) -> {
			for (Person p : list)
				System.out.println(p.toString());
		};

		ListTools aboveAge = (List<Person> list, Predicate<Person> pred) -> {
			for (Person p : list)
				if (pred.test(p))
					System.out.println(p.toString());
		};

		System.out.println("----------ALL NAMES--------------");
		PersonTestLambdaWithPredicate p1 = new PersonTestLambdaWithPredicate();
		p1.doTask(allNames, l1, null);
		System.out.println("----------EQAL AND ABOVE 26--------------");
		p1.doTask(aboveAge, l1, new Predicate() {
			@Override
			public boolean test(Object arg0) {
				return ((Person)arg0).getAge() >= 26;
			}
		});
	}

	public void doTask(ListTools lt, List<Person> l1, Predicate<Person> p1) {
		lt.printList(l1, p1);
	}

	interface ListTools {
		public void printList(List<Person> l1, Predicate<Person> p1);
	}

}
