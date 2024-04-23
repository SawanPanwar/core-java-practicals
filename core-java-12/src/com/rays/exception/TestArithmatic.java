package com.rays.exception;

public class TestArithmatic {

	public static void main(String[] args) {

		System.out.println("before");

		try {
			int a = 20;

			int b = 4;

			int c = a / b;

			System.out.println("sum = " + c);

		} catch (Exception e) {

			System.out.println("Exception: " + e.getMessage());

		}

		System.out.println("after");

	}

}
