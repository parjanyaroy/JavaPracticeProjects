package com.pj.filterpattern.implementation.filterimpl;

import java.util.ArrayList;
import java.util.List;

import com.pj.filterpattern.implementation.CriteriaMaritalStatus;
import com.pj.filterpattern.implementation.Person;
import com.pj.filterpattern.services.Criteria;
import com.pj.filterpattern.services.CriteriaMatcher;
import com.pj.filterpattern.services.ServiceObject;

public class FilterMaritalStatus implements CriteriaMatcher {

	@Override
	public List<ServiceObject> matchCriteria(List<ServiceObject> serviceObjects, Criteria criteria) {
		List<ServiceObject> l1 = new ArrayList<>();
		if (criteria instanceof CriteriaMaritalStatus) {
			for (ServiceObject obj1 : serviceObjects) {
				if (obj1 instanceof Person) {
					if(((Person)obj1).marittalStatus.equalsIgnoreCase(((CriteriaMaritalStatus)criteria).MaritalStatus))
						l1.add(obj1);	
				}
			}
		}
		return l1;
	}
}
