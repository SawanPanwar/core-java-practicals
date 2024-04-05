package com.rays.basics;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 1541;

		int r = 0;

		int sum = 0;

		int n = number;

		while (n > 0) {

			r = n % 10;

			sum = (sum * 10) + r;

			n = n / 10;

		}

		System.out.println("Reverse Number = " + sum);

	}

}
