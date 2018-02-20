package com.pj.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeAboveAge implements FilterEmployee {

	int age;
	
	
	
	public FilterEmployeeAboveAge(int age) {
		super();
		this.age = age;
	}



	@Override
	public List<Employee> filterResult(List<Employee> employeeList) {
	List<Employee> result = new ArrayList<>();
	for(Employee e1 : employeeList)
	{
		if(e1.getAge()>this.age)
			result.add(e1);
	}
		return result;
	}

}
