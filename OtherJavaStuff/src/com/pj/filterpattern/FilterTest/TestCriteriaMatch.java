package com.pj.filterpattern.FilterTest;

import java.util.ArrayList;
import java.util.List;

import com.pj.filterpattern.implementation.CriteriaAboveAge;
import com.pj.filterpattern.implementation.CriteriaGender;
import com.pj.filterpattern.implementation.CriteriaMaritalStatus;
import com.pj.filterpattern.implementation.Person;
import com.pj.filterpattern.implementation.filterimpl.FilterAboveAge;
import com.pj.filterpattern.implementation.filterimpl.FilterGender;
import com.pj.filterpattern.implementation.filterimpl.FilterMaritalStatus;
import com.pj.filterpattern.services.Criteria;
import com.pj.filterpattern.services.ServiceObject;

public class TestCriteriaMatch {
	
	public static void main(String[] args) {
		Person p1 = new Person("ABC", 20, "M", "Married");
		Person p2 = new Person("DEF", 40, "F", "Single");
		Person p3 = new Person("GHI", 60, "M", "Single");
		Person p4 = new Person("JKL", 70, "F", "Married");
		Person p5 = new Person("MNO", 90, "M", "Single");
		Person p6 = new Person("PQR", 10, "F", "Single");
		Person p7 = new Person("STU", 30, "M", "Married");
		Person p8 = new Person("VWX", 50, "F", "Single");
		Person p9 = new Person("GOD", 80, "M", "Single");
		Person p10 = new Person("OPR",100,"F", "Married");
		List<ServiceObject> l1 = new ArrayList<>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		l1.add(p5);
		l1.add(p6);
		l1.add(p7);
		l1.add(p8);
		l1.add(p9);
		l1.add(p10);
		Criteria c1 =  new CriteriaAboveAge(30);
		Criteria c2 =  new CriteriaMaritalStatus("Single");
		Criteria c3 =  new CriteriaMaritalStatus("Married");
		Criteria c4 =  new CriteriaGender("M");
		printList("Single:     ",(new FilterMaritalStatus()).matchCriteria(l1, c2));
		printList("is Married: ",(new FilterMaritalStatus()).matchCriteria(l1, c3));
		printList("Male:       ",(new FilterGender()).matchCriteria(l1, c4));
		printList("Above 50:   ",(new FilterAboveAge()).matchCriteria(l1, c1));
		
		
	}
	
	static void printList(String s1,List<ServiceObject> l1)
	{
		System.out.println(s1+" ");
		for(ServiceObject s : l1)
		{
			if(s instanceof Person)
			{
				Person p=(Person)s;
				System.out.println(p.name+" "+p.age+" "+p.gender+" "+p.marittalStatus);
			}
		}
	}

}
