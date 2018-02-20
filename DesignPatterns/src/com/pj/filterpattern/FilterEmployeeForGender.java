package com.pj.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeForGender implements FilterEmployee {

	String gender;
	
	
	
	public FilterEmployeeForGender(String gender) {
		super();
		this.gender = gender;
	}



	@Override
	public List<Employee> filterResult(List<Employee> employeeList) {
	List<Employee> result = new ArrayList<>();
	for(Employee e1 : employeeList)
	{
		if(e1.getGender().equalsIgnoreCase(this.gender))
			result.add(e1);
	}
		return result;
	}

}
