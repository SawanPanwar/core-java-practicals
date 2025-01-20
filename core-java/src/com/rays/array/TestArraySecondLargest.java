package com.rays.array;

public class TestArraySecondLargest {

	public static void main(String[] args) {

		int[] arr = { 100, 10, 11, 5, 13, 17, 88 };

		int secondHighest = 0;

		int highest = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > highest) {

				secondHighest = highest;

				highest = arr[i];

			}

			if (arr[i] < highest && arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		System.out.println("Highest: " + highest);

		System.out.println("Second Highest: " + secondHighest);
	}
}
