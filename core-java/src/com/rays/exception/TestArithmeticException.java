package com.rays.exception;

public class TestArithmeticException {

	public static void main(String[] args) {

		int a = 10;

		int b = 0;

		try {

			int c = a / b;
			System.out.println("Division = " + c);

		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}