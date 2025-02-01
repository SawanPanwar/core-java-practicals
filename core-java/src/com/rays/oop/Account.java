package com.rays.oop;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	// Getters and Setters
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Invalid balance amount");
		}
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited: " + amount);
			System.out.println("New Balance: " + balance);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	// Withdraw method
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
			System.out.println("Remaining Balance: " + balance);
		} else if (amount > balance) {
			System.out.println("Insufficient funds. Available balance: " + balance);
		} else {
			System.out.println("Invalid withdrawal amount");
		}
	}

	// Fund Transfer method
	public void fundTransfer(Account accountToTransfer, double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			accountToTransfer.balance = accountToTransfer.balance + amount;
			System.out.println("Transferred " + amount + " to " + accountToTransfer.getNumber());
			System.out.println("Your New Balance: " + this.balance);
		} else {
			System.out.println("Transfer failed. Insufficient funds or invalid amount");
		}
	}

	// Pay Bill method
	public void payBill(String biller, double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Paid " + amount + " to " + biller);
			System.out.println("New Balance: " + balance);
		} else {
			System.out.println("Payment failed. Insufficient funds or invalid amount");
		}
	}

	// Display Account Details
	public void displayAccountInfo() {
		System.out.println("Account Details:");
		System.out.println("Account Number: " + number);
		System.out.println("Account Type: " + accountType);
		System.out.println("Balance: " + balance);
	}
}
