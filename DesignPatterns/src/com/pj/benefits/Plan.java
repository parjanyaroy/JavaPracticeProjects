package com.pj.benefits;

import java.util.List;

interface Plan {
	
	List<Employee> enroll(List<Employee> allEmployee);
	
	void saveEnrolledEmployee(List<Employee> allEmployee);
		
}
