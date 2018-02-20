package com.pj.thread.busySpinning;

public class Consumer implements Runnable {

	Producer p;
	
	
	@Override
	public void run() {
		while(!p.isSet)
		{
			System.out.println("Waiting For Producer to produce");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int x : p.numberList)
		{
			System.out.println("Produce :"+x);
		}

	}


	public Consumer(Producer p) {
		super();
		this.p = p;
	}

}
