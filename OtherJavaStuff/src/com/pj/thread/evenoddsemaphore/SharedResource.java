package com.pj.thread.evenoddsemaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
	
	Semaphore sOdd = new Semaphore(1);
	Semaphore sEven = new Semaphore(0);
	
	void printEven(int num)
	{
		System.out.println("Even Permits:"+sEven.availablePermits());
		try {
			sEven.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num);
		sOdd.release();
	}
	
	void printOdd(int num)
	{
		try {
			sOdd.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num);
		sEven.release();
	}

}
