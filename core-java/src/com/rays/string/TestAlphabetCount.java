package com.rays.string;

public class TestAlphabetCount {

	public static void main(String[] args) {

		String name = "vijay dinanath chouhan";

		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int i = 0; i < name.length(); i++) {

				if (ch == name.charAt(i)) {
					count++;
				}
			}

			if (count != 0) {
				System.out.println(ch + " count = " + count);
			}
			count = 0;
		}
	}
}
