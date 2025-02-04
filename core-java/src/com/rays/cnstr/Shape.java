package com.rays.cnstr;

public class Shape {

	private String color;

	private int borderWidth;

	public Shape() {
		System.out.println("default constructor");
	}

	public Shape(String color, int borderWidth) {
		System.out.println("2 param constructor");
		this.color = color;
		this.borderWidth = borderWidth;
	}

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
}
