package com.rays.array;

public class SecondHighest {

	public static void main(String[] args) {

		int[] arr = { 100, 1, 10, 11, 5, 4, 8 };

		int min = 0;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				min = max;

				max = arr[i];

			}

			if (arr[i] < max && arr[i] > min) {

				min = arr[i];

			}

		}

		System.out.println("min = " + min);
		System.out.println("max = " + max);

	}

}
