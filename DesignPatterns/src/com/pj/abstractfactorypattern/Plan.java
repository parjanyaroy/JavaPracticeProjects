package com.pj.abstractfactorypattern;

public abstract class Plan {
	
	public abstract int getRate();
	
	public int calculateUnits(int unitsConsumed)
	{
		return getRate()*unitsConsumed;
	}
	

}
