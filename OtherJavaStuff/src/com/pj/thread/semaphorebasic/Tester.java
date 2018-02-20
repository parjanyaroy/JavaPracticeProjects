package com.pj.thread.semaphorebasic;

import java.util.concurrent.Semaphore;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		Semaphore s1 = new Semaphore(0);
		new Thread(new SemaphoreBasic(s1)).start();
		
		Thread.sleep(2000);
		
		s1.release();

	}

}
