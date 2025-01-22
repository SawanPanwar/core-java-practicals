package com.rays.string;

public class TestCharCheck {

	public static void main(String[] args) {

		String name = "vijay dinanath chouhan";

		char ch = 'a';

		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			
			if (name.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("count = " + count);
	}
}
