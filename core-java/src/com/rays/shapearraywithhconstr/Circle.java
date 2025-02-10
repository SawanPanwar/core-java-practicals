package com.rays.shapearraywithhconstr;

public class Circle extends Shape {

	private int radius;

	public static final float PI = 3.14f;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public void area() {
		double cArea = PI * radius * radius;
		System.out.println("Circle Area: " + cArea);
	}
}
