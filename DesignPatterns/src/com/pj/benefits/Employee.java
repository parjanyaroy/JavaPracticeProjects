package com.pj.benefits;

public class Employee {
	
	int id;
	String name;
	int age;
	String gender;
	String location;
	
	public Employee(int id,String name, int age, String gender, String location) {
		super();
		this.id = id;
		this.name=name;
		this.age = age;
		this.gender = gender;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", location="
				+ location + "]";
	}

}
