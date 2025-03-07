package com.rays.java8;

public class TestHelloAnonymous {

	public static void main(String[] args) {

		Hello h = new Hello() {
			@Override
			public void sum(int a) {
				System.out.println("sum method " + a);
			}
		};

		h.sum(10);
	}
}