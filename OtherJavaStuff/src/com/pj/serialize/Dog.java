package com.pj.serialize;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable {

	private int dogNum;
	private  Collar collar;
	Dog(int num,Collar collar)
	{
		this.dogNum=num;
		this.collar=collar;
	}
	
	public Collar getCollar()
	{
		return this.collar;
	}
	
	public int getDogNum()
	{
		return this.dogNum;
	}
	
	public void writeObject(ObjectOutputStream os)
	{
		try{
			os.defaultWriteObject();
			os.writeInt(getCollar().getCollarSize());
			//os.writeChars(getCollar().getBrand());
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	public void readObject(ObjectInputStream is)
	{
		try
		{
			is.defaultReadObject();
			this.collar=new Collar(is.readInt());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
