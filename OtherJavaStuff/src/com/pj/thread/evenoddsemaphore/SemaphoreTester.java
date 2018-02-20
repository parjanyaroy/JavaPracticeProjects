package com.pj.thread.evenoddsemaphore;

public class SemaphoreTester {
	
	public static void main(String[] args) throws InterruptedException {
		SharedResource s = new SharedResource();
		Thread t1 = new Thread(new EvenPrinter(s));
		Thread t2 = new Thread(new OddPrinter(s));
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}

}
