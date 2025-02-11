package com.rays.abs;

public class TestShape2 {

	public static void main(String[] args) {

		Shape shape = new Rectangle();

		shape.sum();
		shape.area();

		Rectangle rectangle = new Rectangle();

		rectangle.sum();
		rectangle.area();
		
		Shape.sum();
	}
}
