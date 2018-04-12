package com.pj.overriding;

public class Shape {
	
	int x=1;
	int y=10;
	private int someFunction()
	{
		System.out.println("This is some function");
		return 1;
	}
	
	int someLiberalFunction()
	{
			System.out.println("This is someLiberalFunction in shape");
			return 1;
	}

}
