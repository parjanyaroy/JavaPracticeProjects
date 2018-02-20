package com.pj.thread.Exchanger;

import java.util.concurrent.Exchanger;

public class ExchangeTester {
	public static void main(String[] args) throws InterruptedException {
		Exchanger<String> ex = new Exchanger<String>();
		Thread t1= new Thread ( new Producer(ex));
		Thread t2= new Thread ( new Consumer(ex));
		t2.start();
		t1.start();
	}

}
