package com.rays.oop.methodreturn;

public class Triangle extends Shape {

	private int base;

	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double area() {
		double tArea = (base * height) / 2;
		System.out.println("Triangle Area = " + tArea);
		return tArea;
	}
}
