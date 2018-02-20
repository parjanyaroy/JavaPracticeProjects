package com.pj.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeForLocation implements FilterEmployee {

	String location;
	
	
	
	public FilterEmployeeForLocation(String location) {
		super();
		this.location = location;
	}



	@Override
	public List<Employee> filterResult(List<Employee> employeeList) {
	List<Employee> result = new ArrayList<>();
	for(Employee e1 : employeeList)
	{
		if(e1.getLocation().equalsIgnoreCase(this.location))
			result.add(e1);
	}
		return result;
	}

}
