package com.rays.exception;

public class TestNumberFormatException {

	public static void main(String[] args) {

		String str = "abc123";

		try {

			int i = Integer.parseInt(str);

			System.out.println(i);

		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
