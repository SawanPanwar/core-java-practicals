package com.rays.thread;

public class WithThread extends Thread {

	String name = null;

	public WithThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i + " = " + name);

		}
	}
}
