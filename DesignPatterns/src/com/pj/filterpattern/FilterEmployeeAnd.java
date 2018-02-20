package com.pj.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeAnd implements FilterEmployee {

	FilterEmployee [] filters;
	
	public FilterEmployeeAnd(FilterEmployee[] filters) {
		this.filters=filters;
	}



	@Override
	public List<Employee> filterResult(List<Employee> employeeList) {
	List<Employee> result = employeeList;
	for(FilterEmployee filter : filters)
	{
	result = filter.filterResult(result);
	}
		return result;
	}

}
