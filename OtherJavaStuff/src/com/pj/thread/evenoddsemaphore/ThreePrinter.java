package com.pj.thread.evenoddsemaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreePrinter implements Runnable {
	
	CyclicBarrier cb23;
	CyclicBarrier cb31;
		
	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i=i+1)
			{
			cb23.await();
			System.out.println("Print 3");
			cb31.await();
			}
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}		
	}

	public ThreePrinter(CyclicBarrier cb23, CyclicBarrier cb31) {
		super();
		this.cb23 = cb23;
		this.cb31 = cb31;
	}

	

}
