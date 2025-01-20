package com.rays.array;

public class TestFindNumber {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 5, 13, 17, 88 };

		int number = 17;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == number) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("number not exist");
		} else {
			System.out.println("number exist");
		}
	}
}
