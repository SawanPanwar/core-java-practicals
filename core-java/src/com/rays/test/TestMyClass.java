package com.rays.test;

public class TestMyClass {

	public static void main(String[] args) {

		MyClass m = new MyClass(); // object is a instance of a class

		m.name = "abc";

		m.age = 25;

//		m.details();
//		m.sum(10, 20);
//		m.mult(10, 10);
//		m.primeNumber(10);
//		m.palindrome(122);
		// m.diamond(10);

		m.testMethod();

		MyClass.testMethod();
	}
}
