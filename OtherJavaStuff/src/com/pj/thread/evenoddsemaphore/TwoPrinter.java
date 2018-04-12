package com.pj.thread.evenoddsemaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TwoPrinter implements Runnable {
	
	CyclicBarrier cb12;
	CyclicBarrier cb23;
		
	@Override
	public void run() {
		try {
		for(int i=1;i<=10;i=i+1)
		{
		cb12.await();
		System.out.println("Print 2");
		cb23.await();
		}
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
			
	}

	public TwoPrinter(CyclicBarrier cb12, CyclicBarrier cb23) {
		super();
		this.cb12 = cb12;
		this.cb23 = cb23;
	}

	

}
