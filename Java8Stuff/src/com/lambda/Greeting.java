package com.lambda;

@FunctionalInterface
public interface Greeting {
	
	public void perform();
	
	default String sayHello()
	{
		return "Hello";
	}
	
	default String sayHi()
	{
		callStaticMethod();
		return "Hello";
	}
	
	static void callStaticMethod()
	{
		System.out.println("This is a static method");
	}
	
	

}
