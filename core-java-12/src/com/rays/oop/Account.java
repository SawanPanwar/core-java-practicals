package com.rays.oop;

public class Account {

	private int balance;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposite(int amount) {

		balance = balance + amount; // balance += amount;

		System.out.println("balance = " + balance);

	}

	public void withdrawl(int amount) {

		if (balance - amount >= 2000) {

			balance = balance - amount; // balance += amount;

			System.out.println("balance = " + balance);
			
		} else {
			System.out.println("Insufficient balance..!!!");
		}

	}

}
