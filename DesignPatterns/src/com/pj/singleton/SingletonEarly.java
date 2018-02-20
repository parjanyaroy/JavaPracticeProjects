package com.pj.singleton;

public class SingletonEarly {

	private static SingletonEarly instance = new SingletonEarly();
	
	private SingletonEarly(){}
	
	public synchronized SingletonEarly getInstance()
	{
		return instance;
	}
	
	
}
