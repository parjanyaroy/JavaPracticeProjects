package com.pj.filterpattern.implementation;

import com.pj.filterpattern.services.Criteria;

public class CriteriaGender implements Criteria {

	public  String gender;

	public CriteriaGender(String gender) {
		super();
		if(null!=gender && (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F") ))
		this.gender = gender;
		else
		this.gender=null;
	}
	
	
	
	
}
