package com.pj.observerpattern;

public interface Observer {
	
	//method to update the observer, used by subject.Called after
	//subject has something to inform observer
	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject sub);
}