package com.pj.finaldeclarations;

import java.util.ArrayList;
import java.util.List;

public class finalExperiments {
	
	public static void main(String[] args) {
		final int a=3;
		// a++; NOT POSSIBLE
		final List<String> l1 = new ArrayList<String>();
		l1.add("ABC");
		// l1= new ArrayList<String>(); NOT POSSIBLE
		final int arr[] = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		for(int i: arr)
			System.out.print(i+" ");
		System.out.println();
		arr[1]=56;
		for(int i: arr)
			System.out.print(i+" ");
		System.out.println();
		final Employee e1=new Employee(1);
		final Employee e2=new Employee(2);
		final Employee arrE[] = new Employee[]{e1,e2};
		for(Employee e: arrE)
			System.out.print(e.toString());
		arrE[0]=null;
		System.out.println();
		for(Employee e: arrE)
			if(null!=e)
			System.out.print(e.toString());
		
		
		
	}

}

class Employee
{
	private int name;

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public int getName() {
		return name;
	}

	public Employee(int name) {
		super();
		this.name = name;
	}
	
	
}
