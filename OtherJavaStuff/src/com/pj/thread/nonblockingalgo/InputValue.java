package com.pj.thread.nonblockingalgo;

import java.util.concurrent.atomic.AtomicInteger;

public class InputValue {
	
	AtomicInteger value = new AtomicInteger();
		
	int getValue()
	{
		return value.get();
	}
	
	
	void setValue(int x)
	{
		int oldValue=value.get();
		value.compareAndSet(oldValue,x);
	}

}
