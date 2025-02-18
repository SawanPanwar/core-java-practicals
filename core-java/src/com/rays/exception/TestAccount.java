package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) {

		System.out.println("before");

		Account acc = new Account();

		acc.setBalance(1000);

		acc.deposit(200);

		try {
			acc.withdraw(1300);

		} catch (InsufficientFundException e) {

			System.out.println(e);

		}
		
		acc.deposit(500);
		
		try {
			acc.withdraw(1300);

		} catch (InsufficientFundException e) {

			System.out.println(e);

		}

		System.out.println("after");
	}
}
