package com.pj.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FileParser implements Runnable {

	CyclicBarrier cB;
	
	public FileParser(CyclicBarrier cB) {
		super();
		this.cB = cB;
	}

	@Override
	public void run() {
		System.out.println("Reading File by "+Thread.currentThread().getName());
		try {
			System.out.println("Waiting at the barrier "+Thread.currentThread().getName());
			cB.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
	}

}
