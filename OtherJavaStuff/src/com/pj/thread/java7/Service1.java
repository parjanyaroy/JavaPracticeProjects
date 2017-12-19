package com.pj.thread.java7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Service1 {
	
	private static final int THREAD_COUNT=10;
	
	public static void main(String[] args) {
		
	ExecutorService e1 = Executors.newFixedThreadPool(THREAD_COUNT);
	for(int i=1;i<500;i++)
	{
		Runnable r1 = new TestClass1(i);
		e1.execute(r1);
	}
	
	e1.shutdown();
	//e1.awaitTermination();
		
	}

}
