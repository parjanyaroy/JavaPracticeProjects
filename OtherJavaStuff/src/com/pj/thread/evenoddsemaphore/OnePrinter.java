package com.pj.thread.evenoddsemaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class OnePrinter implements Runnable {
	
	CyclicBarrier cb31;
	CyclicBarrier cb12;
		
	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i=i+1)
			{
			cb31.await();
			System.out.println("Print 1");
			cb12.await();
			}
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
	}

	public OnePrinter(CyclicBarrier cb31, CyclicBarrier cb12) {
		super();
		this.cb31 = cb31;
		this.cb12 = cb12;
	}

	

}
