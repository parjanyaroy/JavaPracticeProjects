package com.pj.benefits;

import java.util.List;

public class FilterEmployeeAnd implements FilterEmployee {

	List<FilterEmployee>  filters;
	
	public FilterEmployeeAnd(List<FilterEmployee> filters) {
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
