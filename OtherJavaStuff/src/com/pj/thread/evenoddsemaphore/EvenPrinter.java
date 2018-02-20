package com.pj.thread.evenoddsemaphore;

public class EvenPrinter implements Runnable {
	
	SharedResource sharedResource;
		
	@Override
	public void run() {
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println("Trying to print even");
			sharedResource.printEven(i);
		}
			
	}

	public EvenPrinter(SharedResource sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}

}
