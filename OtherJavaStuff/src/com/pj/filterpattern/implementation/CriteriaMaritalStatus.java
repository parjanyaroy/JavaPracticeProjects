package com.pj.filterpattern.implementation;

import com.pj.filterpattern.services.Criteria;

public class CriteriaMaritalStatus implements Criteria {
	
	public String MaritalStatus;

	public CriteriaMaritalStatus(String maritalStatus) {
		super();
		MaritalStatus = maritalStatus;
	}
	
	

}
