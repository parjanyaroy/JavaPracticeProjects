package com.pj.thread.busySpinning;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
	
	List<Integer> numberList = new ArrayList<>();
	
	boolean isSet = false;
	@Override
	public void run() {
	for(int j=1;j<10;j++)
	{
		System.out.println("Adding numbers to list ");
		numberList.add(j);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	isSet=true;
	}

}
