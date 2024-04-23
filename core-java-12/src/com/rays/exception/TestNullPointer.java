package com.rays.exception;

public class TestNullPointer {

	public static void main(String[] args) {

		try {

			String name = null;

			System.out.println("length = " + name.length());

		} catch (Exception e) {

			System.out.println("Exception: " + e);

		}

	}

}
