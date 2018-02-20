package com.pj.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierTester {
	
	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		CyclicBarrier cB = new CyclicBarrier(4, ()->System.out.println("Barrier Crossed "+Thread.currentThread().getName()));
		Runnable runnable = new FileParser(cB);
		Thread t1=new Thread(runnable, "Thread 1");
		Thread t2=new Thread(runnable, "Thread 2");
		Thread t3=new Thread(runnable, "Thread 3");
		t1.start();
		t2.start();
		t3.start();
		//t1.join();
		//t2.join();
		//t3.join();
		cB.await();
		System.out.println("Program Execution Finished");
	}

}
