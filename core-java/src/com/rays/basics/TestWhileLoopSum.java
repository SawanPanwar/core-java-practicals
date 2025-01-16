package com.rays.basics;

public class TestWhileLoopSum {

	public static void main(String[] args) {

		int i = 1;

		int sum = 0;

		while (i <= 10) {

			System.out.println(i);

			sum = sum + i;

			i++;
		}

		System.out.println("sum = " + sum);

	}
}
