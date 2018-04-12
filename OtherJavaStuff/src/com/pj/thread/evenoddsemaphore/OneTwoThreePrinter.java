package com.pj.thread.evenoddsemaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class OneTwoThreePrinter {
	
	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		CyclicBarrier cb12= new CyclicBarrier(2);
		CyclicBarrier cb23= new CyclicBarrier(2);
		CyclicBarrier cb31= new CyclicBarrier(2);
		Thread t1 = new Thread(new OnePrinter(cb31, cb12));
		Thread t2 = new Thread(new TwoPrinter(cb12, cb23));
		Thread t3 = new Thread(new ThreePrinter(cb23, cb31));
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(1000);
		cb31.await();
		
	}

}
