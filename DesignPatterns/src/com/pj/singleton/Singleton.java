package com.pj.singleton;
public class Singleton {

	private static volatile Singleton instance = null;
	
	private Singleton(){}
	
	public Singleton getInstance()
	{
		if(instance==null)
		{
		synchronized(instance)
		{
		if(instance==null)
		{
			instance = new Singleton();
		}
		}
		}
		return instance;
	}
	
	
}
