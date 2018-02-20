package com.pj.abstractfactorypattern;

public class ElectricityBoardFactoryImpl implements AbstractFactory {

	@Override
	public Plan getPlan(String planType) {
		return null;
	}

	@Override
	public ElectricityBoard getElectricityBoard(String electricityBoard) {
		if(electricityBoard=="WB")
		{
			return new WestBengalBoard();
		}
		else if(electricityBoard=="TS")
		{
			return new TelenganaBoard();
		}
		else
			return null;
			
	}

}
