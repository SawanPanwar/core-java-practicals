package com.rays.string;

public class TestString01 {

	public static void main(String[] args) {

		String name = "Neeraj";

		name = name.toLowerCase();

		char ch = 'n';

		int count = 0;

		for (int i = 0; i <= name.length() - 1; i++) {

			System.out.println(name.charAt(i));

			if (name.charAt(i) == ch) {

				count++;

			}

		}

		System.out.println(ch + " count = " + count);

	}

}
