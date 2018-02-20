package com.entity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Region {
	
	private String regionName;
	private Set<Country> countries= new HashSet<>();
	
	private double netRegionProfit;
	private double grossRegionProfit;
	
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public Set<Country> getCountries() {
		return countries;
	}
	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}
	public double getNetRegionProfit() {
		return netRegionProfit;
	}
	public void setNetRegionProfit(double netRegionProfit) {
		this.netRegionProfit = netRegionProfit;
	}
	public double getGrossRegionProfit() {
		return grossRegionProfit;
	}
	public void setGrossRegionProfit(double grossRegionProfit) {
		this.grossRegionProfit = grossRegionProfit;
	}
	
	void calculateGrossAndNetProfit()
	{
		double grossProfit = 0.0D;
		double netProfit = 0.0D;
		Iterator<Country> i1 = getCountries().iterator();
		while(i1.hasNext())
		{
			Country c1=i1.next();
			grossProfit+=c1.getGrossProfit();
			netProfit+=c1.getNetProfit();
		}
		setGrossRegionProfit(grossProfit);
		setNetRegionProfit(netProfit);
	}	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((regionName == null) ? 0 : regionName.hashCode());
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
		Region other = (Region) obj;
		if (regionName == null) {
			if (other.regionName != null)
				return false;
		} else if (!regionName.equals(other.regionName))
			return false;
		return true;
	}
	
}
