package com.rays.basics;

public class TestDiamond02 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = rows; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
