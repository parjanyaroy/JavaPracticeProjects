package com.pj.abstractfactorypattern;

public class PlanFactoryImpl implements AbstractFactory {
	public Plan getPlan(String planType)
		{
			if(planType==null)
				return null;
			else if(planType=="DomesticPlan")
			{
				return new DomesticPlan();
			}
			else if(planType=="CorporatePlan")
			{
				return new CorporatePlan();
			}
			else if(planType=="IndustrialPlan")
			{
				return new IndustrialPlan();
			}
			else
			{
				return null;
			}
		}

	@Override
	public ElectricityBoard getElectricityBoard(String electricityBoard) {
		// TODO Auto-generated method stub
		return null;
	}
}

