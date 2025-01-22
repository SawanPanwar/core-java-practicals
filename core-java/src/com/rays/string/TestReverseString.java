package com.rays.string;

public class TestReverseString {

	public static void main(String[] args) {

		String name = "vijay dinanath chouhan";

		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.print(name.charAt(i));

		}
	}
}
