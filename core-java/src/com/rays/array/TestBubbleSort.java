package com.rays.array;

public class TestBubbleSort {

	public static void main(String[] args) {

		int[] arr = { 100, 10, 11, 5, 13, 17, 88 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}

			System.out.print(arr[i] + " ");
		}
	}
}
