package com.pj.factorypattern;

public class BillFactory {
	
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

}
