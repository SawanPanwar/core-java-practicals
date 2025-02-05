package com.rays.inheritance;

public class Circle extends Shape {

	private int radius;

	public static final float PI = 3.14f;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void area() {
		double cArea = PI * radius * radius;
		System.out.println("Circle Area: " + cArea);
	}
}
