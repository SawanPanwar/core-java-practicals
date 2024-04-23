package com.rays.exception;

public class TestStringIndex {

	public static void main(String[] args) {

		try {

			String name = "abc";

			System.out.println("char = " + name.charAt(5));

		} catch (Exception e) {

			System.out.println("Exception: " + e);

		}

	}

}
