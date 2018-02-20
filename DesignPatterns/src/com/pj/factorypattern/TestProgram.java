package com.pj.factorypattern;

public class TestProgram {
	
	/**
	 * Factory Method Pattern allows the sub-classes 
	 * to choose the type of objects to create.
	 * 
	 * Usage:
	 * =====
	 * When a class doesn't know what sub-classes will be required to create
	 * When a class wants that its sub-classes specify the objects to be created.
	 * When the parent classes choose the creation of objects to its sub-classes.
	 */

	public static void main(String[] args) {
		BillFactory b1 = new BillFactory();
		/* Here only the requested type of object is passed as a string parameter
		 * and the factory pattern creates a corresponding subclass type .
		 */
		Plan p1 = b1.getPlan("CorporatePlan");
		if(null!=p1)
			System.out.println("Consumption Cost is :"+p1.calculateUnits(30));
		p1 = b1.getPlan("DomesticPlan");
		if(null!=p1)
			System.out.println("Consumption Cost is :"+p1.calculateUnits(30));
	}
	
}
