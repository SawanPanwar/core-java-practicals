package com.rays.basics;

public class ForLoopSum {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

			sum = sum + i;

		}

		System.out.println("sum = " + sum);

	}

}
