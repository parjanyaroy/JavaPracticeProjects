package com.pj.thread.prodconssemaphore;

import java.util.concurrent.Semaphore;

public class SharedRes {
	
	Semaphore sProducer = new Semaphore(1);
	Semaphore sConsumer = new Semaphore(0);
	
	int produce;
	
	public void put(int pProduce) throws InterruptedException
	{
		sProducer.acquire();
		System.out.println("Producing "+pProduce);
		this.produce=pProduce;
		sConsumer.release();
	}
	
	public void get() throws InterruptedException
	{
		sConsumer.acquire();
		System.out.println("Consuming :"+this.produce);
		sProducer.release();
	}
	

}
