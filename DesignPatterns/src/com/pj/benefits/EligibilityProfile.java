package com.pj.benefits;

import java.util.ArrayList;
import java.util.List;

public class EligibilityProfile {
	
	FilterEmployee filterAnd = null ;
	
	List<FilterEmployee> subFilters = new ArrayList<FilterEmployee>();

	public FilterEmployee getFilterAnd() {
		return filterAnd;
	}

	public void setFilterAnd(FilterEmployee filterAnd) {
		this.filterAnd = filterAnd;
	}

	public List<FilterEmployee> getSubFilters() {
		return subFilters;
	}

	public void setSubFilters(List<FilterEmployee> subFilters) {
		this.subFilters = subFilters;
	}
	
	void createEigibilityProfile()
	{
		filterAnd = new FilterEmployeeAnd(subFilters);
	}
		
}
