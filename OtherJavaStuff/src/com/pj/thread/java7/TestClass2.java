package com.pj.thread.java7;

import java.util.concurrent.Callable;

public class TestClass2 implements Callable<Integer> {
	
	private int countTill=0;
	
	TestClass2(int x)
	{
		this.countTill=x;
	}
	@Override
	public Integer call()throws Exception
	{
	int sum=0;
	for(int i=0;i<countTill;i++)
	{
		sum+=i;
	}
	return sum;
	}

}
