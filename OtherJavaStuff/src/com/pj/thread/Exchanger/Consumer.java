package com.pj.thread.Exchanger;

import java.util.concurrent.Exchanger;

public class Consumer implements Runnable {
	
	Exchanger<String> e1;
	
	public Consumer(Exchanger<String> e1) {
		super();
		this.e1 = e1;
		
	}

	String s1;
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			try {
				System.out.println("Waiting for the"+i+"Produce");
				s1=e1.exchange(s1);
				System.out.println("Value From Producer"+s1);
				s1=null;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
