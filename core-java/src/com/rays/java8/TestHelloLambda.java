package com.rays.java8;

public class TestHelloLambda {

	public static void main(String[] args) {

		Hello h = (a) -> {
			System.out.println("sum by lambda " + a);
		};

		h.sum(100);
	}
}