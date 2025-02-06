package com.rays.overloading;

public class Shape {

	public void area() {
		System.out.println("shape area method");
	}

	public void area(int a, int b) {
		int area = a * b;
		System.out.println("shape area method: " + area);
	}
}
