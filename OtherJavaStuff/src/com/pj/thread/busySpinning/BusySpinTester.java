package com.pj.thread.busySpinning;

public class BusySpinTester {

	public static void main(String[] args) {
		Producer p = new Producer();
		Thread t1 = new Thread(new Consumer(p));
		Thread t2 = new Thread(p);
		t1.start();
		t2.start();
	}
	
}
