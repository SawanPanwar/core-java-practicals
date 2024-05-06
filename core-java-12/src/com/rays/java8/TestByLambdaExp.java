package com.rays.java8;

public class TestByLambdaExp {

	public static void main(String[] args) {

		Hello h = () -> {

			System.out.println("By Lambda Expression....!!!!");

		};

		h.say();

	}
}
