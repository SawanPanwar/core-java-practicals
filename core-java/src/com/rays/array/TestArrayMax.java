package com.rays.array;

public class TestArrayMax {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 5, 13, 17, 88 };

		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}
		}

		System.out.println("maximum: " + max);
	}
}
