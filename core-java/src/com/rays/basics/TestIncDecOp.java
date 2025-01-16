package com.rays.basics;

public class TestIncDecOp {

	public static void main(String[] args) {

		int i = 1;

		int sum = i++ + i + ++i + --i;

		System.out.println("sum: " + sum);
	}
}
