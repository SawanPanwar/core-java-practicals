package com.rays.withoutcnstr;

public class TestShape {

	public static void main(String[] args) {

		Shape shapeRectangle = new Rectangle();

		Rectangle r = (Rectangle) shapeRectangle;
		
		r.setLength(10);
		r.setWidth(20);

		shapeRectangle.area();

		Shape shapeCircle = new Circle();

		Circle c = (Circle) shapeCircle;
		
		c.setRadius(50);

		shapeCircle.area();

		Shape shapeTriangle = new Triangle();

		Triangle t = (Triangle) shapeTriangle;
		
		t.setBase(30);
		t.setHeight(50);

		shapeTriangle.area();

	}
}
