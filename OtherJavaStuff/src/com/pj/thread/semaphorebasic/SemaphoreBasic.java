package com.pj.thread.semaphorebasic;

import java.util.concurrent.Semaphore;

public class SemaphoreBasic implements Runnable {

	Semaphore s1;
	
	@Override
	public void run() {
		System.out.println("Trying to acquire");
		try {
			s1.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Lock Acquired");
		s1.release();
		
	}

	public SemaphoreBasic(Semaphore s1) {
		super();
		this.s1 = s1;
	}
	

}
