package com.rays.withoutcnstr;

public class Shape {

	private String color;

	private int borderWidth;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void area() {
		System.out.println("Shape Area Method");
	}
}