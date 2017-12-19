package com.pj.collection.hashmap;

public class Customer implements Comparable {

	private String name;
	private String customerGrade;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerGrade == null) ? 0 : customerGrade.hashCode());
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
		Customer other = (Customer) obj;
		if (customerGrade == null) {
			if (other.customerGrade != null)
				return false;
		} else if (!customerGrade.equals(other.customerGrade))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	Customer(String name,String grade)
	{
		this.name=name;
		this.customerGrade=grade;
	}
	
	@Override
	public int compareTo(Object arg0) {
		return ((Customer)arg0).getCustomerGrade().compareTo(this.getCustomerGrade());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	

}
