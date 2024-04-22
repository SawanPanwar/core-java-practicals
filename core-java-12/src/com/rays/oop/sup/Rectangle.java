package com.rays.oop.sup;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width, String color, int borderWidth) {
		super(color, borderWidth);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double area() {
		double rArea = length * width;
		System.out.println("Rectangle Area = " + rArea);
		return rArea;
	}
}
