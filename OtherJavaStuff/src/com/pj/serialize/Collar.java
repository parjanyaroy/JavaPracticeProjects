package com.pj.serialize;

import java.io.Serializable;

public class Collar implements Serializable {
	
	int collarSize;
	String brand;
	
	Collar(int size)
	{
		this.collarSize=size;
		//this.brand=brand;
	}
	
	int getCollarSize()
	{
		return this.collarSize;
	}
	
	String getBrand()
	{
		return this.brand;
	}

}
