package com.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		
		// Creating accounts using setter methods
		Account acc1 = new Account();
		acc1.setNumber("BOI223344");
		acc1.setAccountType("Savings");
		acc1.setBalance(1000);

		Account acc2 = new Account();
		acc2.setNumber("SBI232345");
		acc2.setAccountType("Current");
		acc2.setBalance(500);

		// Displaying initial details
		acc1.displayAccountInfo();
		System.out.println();
		acc2.displayAccountInfo();

		// Deposit money
		System.out.println("\nDepositing money...");
		acc1.deposit(200);

		// Withdraw money
		System.out.println("\nWithdrawing money...");
		acc1.withdraw(500);

		// Fund transfer
		System.out.println("\nTransferring funds...");
		acc1.fundTransfer(acc2, 300);

		// Pay bill
		System.out.println("\nPaying Bill...");
		acc1.payBill("Electricity", 100);

		// Final Account Status
		System.out.println("\nFinal Account Details:");
		acc1.displayAccountInfo();
		System.out.println();
		acc2.displayAccountInfo();
	}
}
