package com.rays.abs;

public class Rectangle extends Shape {

	private int length;

	private int width;

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public void area() {
		int rArea = length * width;
		System.out.println("Rectangle Area: " + rArea);
	}
}
