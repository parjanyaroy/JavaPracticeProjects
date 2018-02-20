package com.pj.benefits;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeBelowAge implements FilterEmployee {

	int age;
	
	
	
	public FilterEmployeeBelowAge(int age) {
		super();
		this.age = age;
	}



	@Override
	public List<Employee> filterResult(List<Employee> employeeList) {
	List<Employee> result = new ArrayList<>();
	for(Employee e1 : employeeList)
	{
		if(e1.getAge()<this.age)
			result.add(e1);
	}
		return result;
	}

}
