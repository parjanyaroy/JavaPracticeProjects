package com.pj.thread.countdownlatches;

import java.util.concurrent.CountDownLatch;



public class LatchTester {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch cL = new CountDownLatch(3);
		Runnable runnable = new FileParser(cL);
		Thread t1=new Thread(runnable, "Thread 1");
		Thread t2=new Thread(runnable, "Thread 2");
		Thread t3=new Thread(runnable, "Thread 3");
		t1.start();
		t2.start();
		t3.start();
		// Let the threads complete their own task
		// To let the main thread finish last either use 
		 t1.join(); t2.join(); t3.join();
		
		System.out.println("Main Thread Exit");
	}

}
