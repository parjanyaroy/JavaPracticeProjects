package com.pj.benefits;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PlanInProgram implements Plan {

	EligibilityProfile profile;
	Set<Employee> enrolledEmployees;
	
	String planName;
	String planDescription;
	
	
	@Override
	public List<Employee> enroll(List<Employee> allEmployee) {
		List<Employee> result = new ArrayList<Employee>();
		if(null!=profile)
		{
			FilterEmployee filter = profile.filterAnd;
			result=filter.filterResult(allEmployee);
		}
		return result;
	}


	@Override
	public void saveEnrolledEmployee(List<Employee> allEmployee) {
		if(null==enrolledEmployees)
			enrolledEmployees = new HashSet<Employee>();
		List<Employee> filteredEmployee = enroll(allEmployee);
		Iterator<Employee> empIterator = filteredEmployee.iterator();
		while(empIterator.hasNext())
		{
			Employee employee = (Employee) empIterator.next();
			enrolledEmployees.add(employee);
		}
		
	}


	public EligibilityProfile getProfile() {
		return profile;
	}


	public void setProfile(EligibilityProfile profile) {
		this.profile = profile;
	}


	public Set<Employee> getEnrolledEmployees() {
		return enrolledEmployees;
	}


	public void setEnrolledEmployees(Set<Employee> enrolledEmployees) {
		this.enrolledEmployees = enrolledEmployees;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public String getPlanDescription() {
		return planDescription;
	}


	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}


	public PlanInProgram(EligibilityProfile profile, String planName, String planDescription) {
		super();
		this.profile = profile;
		this.planName = planName;
		this.planDescription = planDescription;
	}
	
	

}
