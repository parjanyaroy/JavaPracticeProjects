package com.lambda;

public class GreetingImpl implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World");

	}
	@Override
	public String sayHello()
	{
		return "Overridden";
	}

}
