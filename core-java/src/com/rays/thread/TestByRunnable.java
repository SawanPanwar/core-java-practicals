package com.rays.thread;

public class TestByRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ByRunnable("abc"));

		Thread t2 = new Thread(new ByRunnable("xyz"));

		t1.start();
		t2.start();

	}

}
