package com.pj.thread;

import java.util.Random;

public class ThreadLocalExample implements Runnable {

	
	private static ThreadLocal<String> value = new ThreadLocal<String>(){
		@Override protected String initialValue() 
		{
	       return "Hello";
		}};
    
	

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalExample obj = new ThreadLocalExample();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(obj, "" + i);
			Thread.sleep(new Random().nextInt(1000));
			t.start();
		}
	}

	@Override
	public void run() {
		System.out.println("Thread Name= " + Thread.currentThread().getName() + 
				" default  = "+ value.get().toString());
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// formatter pattern is changed here by thread, but it won't reflect to
		// other threads
		value.set("Hi");

		System.out.println(
				"Thread Name= " + Thread.currentThread().getName() +
				" formatter = " + value.get().toString());
	}
	}
