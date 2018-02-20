package com.pj.thread.waitnotify.semaphore;

public class Semaphore {
	
	private boolean signal=false;
	
	public synchronized void take()
	{
		this.signal=true;
		this.notify();
	}
	
	public synchronized void release()throws InterruptedException
	{
		if(this.signal==false)wait();
		this.signal=false;
	}

}
