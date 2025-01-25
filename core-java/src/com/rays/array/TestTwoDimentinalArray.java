package com.rays.array;

public class TestTwoDimentinalArray {

	public static void main(String[] args) {

		int[] arr = { 100, 200, 300 };

		int[] arr1 = new int[3]; // One Dimentional

		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;

		int[][] table = new int[10][10]; // Two Dimentional

		table[0][0] = 1;
		table[0][1] = 2;
		table[0][2] = 3;

		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table.length; j++) {

				table[i][j] = (i + 1) * (j + 1);

				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
