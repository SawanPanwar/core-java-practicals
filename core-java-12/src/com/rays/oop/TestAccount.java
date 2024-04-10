package com.rays.oop;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(1000);
		
		System.out.println(a.getBalance());
		
		a.deposite(5000);
		
		a.withdrawl(4001);
		
	}

}
