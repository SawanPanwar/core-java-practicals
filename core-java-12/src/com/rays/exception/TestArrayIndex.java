package com.rays.exception;

public class TestArrayIndex {

	public static void main(String[] args) {

		try {

			int[] arr = { 1, 2, 3, 4, 5 };

			System.out.println("arr = " + arr[8]);

		} catch (Exception e) {

			System.out.println("Exception: " + e);

		}

	}

}
