package com.pj.proxypattern;

public class AccountDB implements Account {

	String employeeName;
	// Restricted DB Access
	public void getAccountBalance() {
		System.out.println("Employee:"+employeeName+" Balance: "+(int)(Math.random()*100));
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public AccountDB(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

}
