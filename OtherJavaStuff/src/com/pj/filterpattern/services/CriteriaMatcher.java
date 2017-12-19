package com.pj.filterpattern.services;

import java.util.List;

public interface CriteriaMatcher {
	
	public List<ServiceObject> matchCriteria(List<ServiceObject> serviceObjects,Criteria criteria);

}
