package com.pj.thread.java7;

public class TestClass1 implements Runnable {
	
	private int countTill=0;
	
	TestClass1(int x)
	{
		this.countTill=x;
	}
	
	public void run()
	{
	int sum=0;
	for(int i=0;i<countTill;i++)
	{
		sum+=i;
	}
	System.out.println("Sum of Thread "+Thread.currentThread().getName()+" is "+sum);
	}

}
