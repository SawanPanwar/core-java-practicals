package com.rays.test;

public class MyClass {

	// basic building block, structure of an Object, contains variables, methods,
	// constructors

	String name;
	int age;

	public void details() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println("sum: " + c);
	}

	public void mult(int a, int b) {
		int c = a * b;
		System.out.println("mult: " + c);
	}

	public void primeNumber(int number) {

		int count = 0;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}
	}

	public void palindrome(int number) {

		int r = 0;

		int sum = 0;

		int n = number;

		while (n > 0) {

			r = n % 10;

			sum = (sum * 10) + r;

			n = n / 10;
		}
		if (sum == number) {
			System.out.println("Palindrome  Number: " + sum);
		} else {
			System.out.println("not Palindrome  Number: " + sum);
		}
	}

	public void diamond(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = rows - 1; i >= 1; i--) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
