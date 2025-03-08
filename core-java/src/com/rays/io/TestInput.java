package com.rays.io;

import java.util.Scanner;

public class TestInput {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a: ");

		int a = sc.nextInt();

		System.out.println("enter b: ");

		int b = sc.nextInt();

		int c = a + b;

		System.out.println("sum: " + c);

		sc.close();
	}
}