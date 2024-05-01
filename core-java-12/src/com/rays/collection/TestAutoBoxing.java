package com.rays.collection;

public class TestAutoBoxing {

	public static void main(String[] args) {

		int a1 = 10;

		Integer a2 = new Integer(a1); // Integer a2 = a1;

		int a3 = a2.intValue(); // int a3 = a2;

	}

}
