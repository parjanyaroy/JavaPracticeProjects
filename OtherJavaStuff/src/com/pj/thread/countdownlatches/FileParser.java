package com.pj.thread.countdownlatches;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class FileParser implements Runnable {

	CountDownLatch cL;
	
	public FileParser(CountDownLatch cL) {
		super();
		this.cL = cL;
	}

	@Override
	public void run() {
		System.out.println("Reading File by "+Thread.currentThread().getName());
		try {
			System.out.println("Going To Sleep "+Thread.currentThread().getName());
			Thread.sleep(1000);
			cL.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}



}
