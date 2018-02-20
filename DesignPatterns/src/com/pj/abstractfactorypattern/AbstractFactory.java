package com.pj.abstractfactorypattern;

public interface  AbstractFactory { // can be declared as abstract class also 
	
	public Plan getPlan(String planType);
	public ElectricityBoard getElectricityBoard(String electricityBoard);

}
