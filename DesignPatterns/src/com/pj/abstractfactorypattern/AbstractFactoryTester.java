package com.pj.abstractfactorypattern;

public class AbstractFactoryTester {

	public static void main(String[] args) {
		AbstractFactory electricityBoard = new ElectricityBoardFactoryImpl();
		AbstractFactory plan = new PlanFactoryImpl();
		System.out.println("Plan Details:"+electricityBoard.getElectricityBoard("WB").getBoard()+": Charge :"+plan.getPlan("DomesticPlan").calculateUnits(100));
		
		

	}

}
