package com.rays.basics;

public class ArraySorting {

	public static void main(String[] args) {

		int[] arr = { 100, 12, 15, 67, 67, 89, 90 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

				for (int k : arr) {
					System.out.print(k + ", ");
				}

				System.out.println();
			}

		}

	}
}
