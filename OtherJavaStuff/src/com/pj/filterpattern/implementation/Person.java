package com.pj.filterpattern.implementation;

import com.pj.filterpattern.services.ServiceObject;

public class Person implements ServiceObject {

	public String name;
	public int age;
	public String gender;
	public String marittalStatus;
	
	public Person(String name, int age, String gender, String marittalStatus) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marittalStatus = marittalStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((marittalStatus == null) ? 0 : marittalStatus.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (marittalStatus == null) {
			if (other.marittalStatus != null)
				return false;
		} else if (!marittalStatus.equals(other.marittalStatus))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
