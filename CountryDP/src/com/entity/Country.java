package com.entity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Country {
	
	private String countryName;
	private String currency;
	private Set<Account> accounts=new HashSet<>();
	// Gross Profit Of A Country :
	private double grossProfit ;
	// Net Profit Of A Country :
	private double netProfit ;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	public double getGrossProfit() {
		return grossProfit;
	}
	public void setGrossProfit(double grossProfit) {
		this.grossProfit = grossProfit;
	}
	public double getNetProfit() {
		return netProfit;
	}
	public void setNetProfit(double netProfit) {
		this.netProfit = netProfit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
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
		Country other = (Country) obj;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}
	
	void calculateGrossAndNetProfit()
	{
		double grossProfit = 0.0D;
		double netProfit = 0.0D;
		Iterator<Account> i1 = getAccounts().iterator();
		while(i1.hasNext())
		{
			Account a1=i1.next();
			grossProfit+=a1.getProfit();
			netProfit+=a1.getNetProfit();
		}
		setGrossProfit(grossProfit);
		setNetProfit(netProfit);
	}	

	
}
