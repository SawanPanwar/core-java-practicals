package com.rays.exception;

public class TestArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		try {

			System.out.println(arr[6]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
