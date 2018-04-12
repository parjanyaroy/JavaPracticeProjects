package com.pj.thread.cyclicbarrier123;

public class OddPrinter implements Runnable {
	
	SharedResource sharedResource;
		
	@Override
	public void run() {
		for(int i=1;i<=9;i=i+2)
		{
			System.out.println("Trying to print odd");
			sharedResource.printOdd(i);
		}
			
	}

	public OddPrinter(SharedResource sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}

}
