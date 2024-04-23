package com.rays.oop.shallow;

public class TestAccount {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account a1 = new Account();

		a1.balance = 10;

		Account a2 = (Account) a1.clone();

		a2.balance = 20;

		System.out.println(a1.balance);
		System.out.println(a2.balance);

	}

}
