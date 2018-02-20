package com.pj.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterTester {

	public static void main(String[] args) {
		Employee e1= new Employee(1,"ROHIT",27,"M","KOL");
		Employee e2= new Employee(2,"SUCHI",24,"F","HYD");
		Employee e3= new Employee(3,"GOURAB",22,"M","KOL");
		Employee e4= new Employee(4,"PRATIK",30,"M","BAN");
		Employee e5= new Employee(5,"SHREYA",25,"F","KOL");
		Employee e6= new Employee(6,"SANMOY",23,"M","HYD");
		Employee e7= new Employee(7,"SAURABH",26,"M","MUM");
		Employee e8= new Employee(8,"ANKITA",32,"F","DEL");
		Employee e9= new Employee(9,"RANO",29,"M","KOL");
		Employee e10= new Employee(10,"HEMANTIKA",35,"HYD","KOL");
		Employee e11= new Employee(11,"ARITRA",27,"M","BAN");
		Employee e12= new Employee(12,"DEBARATI",27,"F","HYD");
		List<Employee> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		l1.add(e6);
		l1.add(e7);
		l1.add(e8);
		l1.add(e9);
		l1.add(e10);
		l1.add(e11);
		l1.add(e12);
		
		
		FilterEmployee f1 = new FilterEmployeeAboveAge(25);
		FilterEmployee f2 = new FilterEmployeeBelowAge(29);
		System.out.println("------------ABOVE 25----------------");
		printList(f1.filterResult(l1));
		System.out.println("------------BELOW 29----------------");
		printList(f2.filterResult(l1));
		System.out.println("------------KOL----------------");
		FilterEmployee f4 = new FilterEmployeeForLocation("KOL");
		printList(f4.filterResult(l1));
		System.out.println("------------ABOVE 25 BELOW 29----------------");
		FilterEmployee f3 = new FilterEmployeeAnd(new FilterEmployee[]{f1,f2});
		printList(f3.filterResult(l1));
		System.out.println("------------ABOVE 25 BELOW 29 in KOL----------------");
		FilterEmployee f5 = new FilterEmployeeAnd(new FilterEmployee[]{f1,f2,f3,f4});
		printList(f5.filterResult(l1));
		
		
		

	}
	
	static void printList(List<Employee> l1)
	{
		for(Employee e:l1)
			System.out.println(e.toString());
	}

}
