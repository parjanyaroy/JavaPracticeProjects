package com.pj.proxypattern;

public class AccountProxy implements Account {
	
	String employeeName;
	
	
	
	// Proxy used to implement a layer of security
	@Override
	public void getAccountBalance() {
		if(getEmployeeName().equalsIgnoreCase("PR"))
			new AccountDB(getEmployeeName()).getAccountBalance();
		else
			System.out.println("Invalid User");
	}



	public AccountProxy(String employeeName) {
		super();
		this.employeeName = employeeName;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
