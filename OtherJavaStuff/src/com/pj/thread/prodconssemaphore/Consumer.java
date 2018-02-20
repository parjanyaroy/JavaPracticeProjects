package com.pj.thread.prodconssemaphore;

public class Consumer implements Runnable {

	SharedRes shared;
	
	@Override
	public void run() {
		for(int i=100;i<120;i++)
		{
			try {
				shared.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public Consumer(SharedRes shared) {
		super();
		this.shared = shared;
	}

}
