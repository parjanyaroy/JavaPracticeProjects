package com.pj.prototype;

abstract class Shape implements Cloneable {
	
	public Object clone()
	{
		Object clonedObject = null ;
		try {
			clonedObject = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedObject;
	}
	
	abstract void drawShape();
	
	abstract int getType();
	
	abstract void setType(int i);
	

}
