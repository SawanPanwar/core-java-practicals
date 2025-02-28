package com.rays.basics;

public class TestIncDecOperator {

	public static void main(String[] args) {

		int i = 1;

		// int sum = i++ + i + ++i + --i;
		// 1 + 2 + 3 + 2

		// int sum = i++ + i++ + i++ + i++ + i++;
		// 1 + 2 + 3 + 4 + 5 = 15

		// int sum = --i + --i + --i + --i + --i;
		// 0 + -1 + -2 + -3 + -4

		/* int sum = i-- + i + ++i + i++ + i + --i; */
		// 1 + 0 + 1 + 1 + 2 + 1

		int sum = i++ + ++i + i-- + i-- + ++i + ++i + i + i--;

		System.out.println("sum: " + sum);
	}
}
