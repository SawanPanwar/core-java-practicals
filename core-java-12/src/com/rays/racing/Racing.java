package com.rays.racing;

public class Racing extends Thread {

	String name = null;

	public static Account account = new Account();

	public Racing(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			account.deposite(name, 1000);
		}
	}
}
