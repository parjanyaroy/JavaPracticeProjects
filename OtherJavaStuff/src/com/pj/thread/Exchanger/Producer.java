package com.pj.thread.Exchanger;

import java.util.concurrent.Exchanger;

public class Producer implements Runnable {
	
	Exchanger<String> e1;
	
	public Producer(Exchanger<String> e1) {
		super();
		this.e1 = e1;
		
	}

	String s1;
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			s1="Produce "+i;
			try {
				Thread.sleep(2000);
				s1=e1.exchange(s1);
				} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
