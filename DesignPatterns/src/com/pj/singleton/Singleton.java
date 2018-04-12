package com.pj.singleton;

import java.io.Serializable;

public class Singleton  extends SingletonSuper implements Serializable{

	private static volatile Singleton instance = null;
	
	private Singleton(){}
	
	public static Singleton getInstance()
	{
		if(instance==null)
		{
		synchronized(Singleton.class)
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
