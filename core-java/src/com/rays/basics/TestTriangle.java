package com.rays.basics;

public class TestTriangle {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= i; j++) { // columns

				System.out.print(i + "\t");

			}
			System.out.println();
			System.out.println();
		}
	}
}
