package com.rays.cloning;

public class Account implements Cloneable {

	public int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
