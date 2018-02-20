package com.pj.proxypattern;

public class ProxyTest {

	public static void main(String[] args) {
		
		Account acc1 = new AccountProxy("PR");
		Account acc2 = new AccountProxy("PJ");
		acc1.getAccountBalance();
		acc2.getAccountBalance();

	}

}
