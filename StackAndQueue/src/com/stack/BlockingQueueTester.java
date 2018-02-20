package com.stack;

public class BlockingQueueTester {
	
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue bq = new BlockingQueue(5);
		
		BlockingQueueCaller b1 = new BlockingQueueCaller(true, bq);
		BlockingQueueCaller b2 = new BlockingQueueCaller(false, bq);
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		Thread t4 = new Thread(b1);
		Thread t5 = new Thread(b1);
		Thread t6 = new Thread(b1);
		
		Thread t7 = new Thread(b2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
				
		
		
		
	}

}
