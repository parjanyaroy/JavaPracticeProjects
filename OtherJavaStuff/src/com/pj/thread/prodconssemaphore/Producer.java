package com.pj.thread.prodconssemaphore;

public class Producer implements Runnable {

	SharedRes shared;
	
	@Override
	public void run() {
		for(int i=100;i<120;i++)
		{
			try {
				shared.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public Producer(SharedRes shared) {
		super();
		this.shared = shared;
	}

}
