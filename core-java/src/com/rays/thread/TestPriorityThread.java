package com.rays.thread;

public class TestPriorityThread {

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("abc");

		PriorityThread t2 = new PriorityThread("xyz");

		// Set thread priorities
		t1.setPriority(10); // Maximum priority
		t2.setPriority(1); // Minimum priority

		t1.start();

		t2.start();
	}
}
