package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		
		s.area();

		Rectangle r = new Rectangle();
		
		r.area();

		Shape shape = new Rectangle();
		
		Rectangle rectangle = (Rectangle) shape;
		
		rectangle.setLength(10);
		rectangle.setWidth(20);
		
		shape.area();

		

		
	}

}
