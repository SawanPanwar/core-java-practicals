package com.rays.string;

public class TestStringArray {

	public static void main(String[] args) {

		String[] arr = { "vijay", "dinanath", "chouhan" };

		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr[i].length(); j++) {

					if (ch == arr[i].charAt(j)) {

						count++;

					}
				}
			}
			System.out.println("count = " + count);
			count = 0;
		}
	}
}
