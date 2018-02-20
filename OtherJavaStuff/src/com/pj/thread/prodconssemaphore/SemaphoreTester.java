package com.pj.thread.prodconssemaphore;

public class SemaphoreTester {
	
	public static void main(String[] args) throws InterruptedException {
		SharedRes s = new SharedRes();
		Thread t1 = new Thread(new Producer(s));
		Thread t2 = new Thread(new Consumer(s));
		t2.start();
		Thread.sleep(1000);
		t1.start();
	}

}
