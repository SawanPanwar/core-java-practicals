package com.rays.exception;

public class TestArithmatic {

	public static void main(String[] args) {

		System.out.println("before");

		try {
			int a = 20;

			int b = 2;

			int c = a / b;

			System.out.println("sum = " + c);

		} catch (Exception e) {

			System.out.println("Exception: " + e.getMessage());

			System.exit(0);

		} finally {
			System.out.println("finally block");
		}

		System.out.println("after");

	}

}
