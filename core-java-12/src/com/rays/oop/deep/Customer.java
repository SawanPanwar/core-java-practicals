package com.rays.oop.deep;

public class Customer implements Cloneable {

	public String name = null;
	
	public Account account = null;

	public Customer(String name) {
		this.name = name;
		this.account = new Account(100);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c =  (Customer) super.clone();
		c.account = (Account) account.clone();
		return c;
	}
}
