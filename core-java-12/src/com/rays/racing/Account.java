package com.rays.racing;

public class Account {

	private int balance = 0;

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public synchronized void deposite(String name, int amt) {

		int total = getBalance() + amt;

		setBalance(total);

		System.out.println(name + " " + getBalance());

	}

}
