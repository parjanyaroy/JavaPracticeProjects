package com.pj.filterpattern.implementation;

import com.pj.filterpattern.services.Criteria;

public class CriteriaAboveAge implements Criteria {
	
	public int age;

	public CriteriaAboveAge(int age) {
		super();
		this.age = age;
	}
	
	

}
