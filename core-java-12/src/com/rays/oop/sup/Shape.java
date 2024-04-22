package com.rays.oop.sup;

public class Shape {

	private String color;
	private int borderWidth;

	public Shape() {
	}

	public Shape(String color, int borderWidth) {
		this();
		this.color = color;
		this.borderWidth = borderWidth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public double area() {
		System.out.println("Shape Area Method..!!!");
		return 0;
	}

}
