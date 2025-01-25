package com.rays.array;

public class TestTwoDimentinalArray02 {

	public static void main(String[] args) {

		int[][] table = new int[10][10];

		for (int i = 0; i < table.length; i++) {

			int sum = 0;

			for (int j = 0; j < table.length; j++) {

				table[i][j] = i + 1 + sum;

				System.out.print(table[i][j] + "\t");

				sum = sum + 10;
			}
			System.out.println();
			System.out.println();
		}
	}
}
