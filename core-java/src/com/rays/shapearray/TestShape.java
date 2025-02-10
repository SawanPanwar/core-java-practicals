package com.rays.shapearray;

public class TestShape {

	public static void main(String[] args) {

		Shape s1 = new Rectangle();

		Rectangle r = (Rectangle) s1;
		r.setLength(10);
		r.setWidth(20);

		Shape s2 = new Circle();

		Circle c = (Circle) s2;
		c.setRadius(10);

		Shape s3 = new Triangle();

		Triangle t = (Triangle) s3;
		t.setBase(20);
		t.setHeight(10);

		s1.area();
		s2.area();
		s3.area();
	}
}
