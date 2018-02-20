package com.pj.benefits;

import java.util.ArrayList;
import java.util.List;

public class EnrollInPlan {

	public static void main(String[] args) {
		Employee e1= new Employee(1,"ROHIT",27,"M","KOL");
		Employee e2= new Employee(2,"SUCHI",24,"F","HYD");
		Employee e3= new Employee(3,"GOURAB",22,"M","KOL");
		Employee e4= new Employee(4,"PRATIK",30,"M","BAN");
		Employee e5= new Employee(5,"SHREYA",25,"F","KOL");
		Employee e6= new Employee(6,"SANMOY",23,"M","HYD");
		Employee e7= new Employee(7,"SAURABH",26,"M","MUM");
		Employee e8= new Employee(8,"ANKITA",32,"F","DEL");
		Employee e9= new Employee(9,"RANO",29,"M","KOL");
		Employee e10= new Employee(10,"HEMANTIKA",35,"HYD","KOL");
		Employee e11= new Employee(11,"ARITRA",27,"M","BAN");
		Employee e12= new Employee(12,"DEBARATI",27,"F","HYD");
		List<Employee> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		l1.add(e6);
		l1.add(e7);
		l1.add(e8);
		l1.add(e9);
		l1.add(e10);
		l1.add(e11);
		l1.add(e12);
		
		EligibilityProfile profile = new EligibilityProfile();
		
		profile.getSubFilters().add(new FilterEmployeeAboveAge(25));
		profile.getSubFilters().add(new FilterEmployeeBelowAge(29));
		//profile.getSubFilters().add(new FilterEmployeeForGender("M"));
		profile.getSubFilters().add(new FilterEmployeeForLocation("KOL"));
		profile.createEigibilityProfile();
		
		Plan p1 = new PlanInProgram(profile,"New Health Plan","This is a health Plan");
		
		p1.saveEnrolledEmployee(l1);
		printList((PlanInProgram)p1);

	}
	
	static void printList(PlanInProgram p1)
	{
		for(Employee e:p1.getEnrolledEmployees())
			System.out.println(e.toString());
	}

}
