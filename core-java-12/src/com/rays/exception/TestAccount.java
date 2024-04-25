package com.rays.exception;

public class TestAccount {

	public static void main(String[] args)  {

		Account a = new Account();

		a.setBalance(1000);

		a.deposite(5000);

		try {
			a.withdrawl(4001);
		} catch (InsufficientBalance e) {
			System.err.println("exception: " + e);
		}
		
		System.out.println(a.getBalance());

	}

}
