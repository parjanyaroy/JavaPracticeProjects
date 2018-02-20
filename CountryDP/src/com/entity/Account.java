package com.entity;

public class Account {
	
	private int id;
	private double profit;
	private float taxRate;
	private double netProfit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public float getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(float taxRate) {
		this.taxRate = taxRate;
	}
	public double getNetProfit() {
		return netProfit;
	}
	public void setNetProfit(double d) {
		this.netProfit = d;
	}
	
	public void calculateNetProfit()
	{
		this.setNetProfit(profit-((double)(taxRate*profit)/100));
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
