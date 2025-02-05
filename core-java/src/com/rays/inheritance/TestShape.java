package com.rays.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.setColor("shape color");
		s.setBorderWidth(1000);
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());

		Rectangle r = new Rectangle();

		r.setLength(20);
		r.setWidth(50);
		r.setColor("red");
		r.setBorderWidth(100);

		System.out.println("length: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		System.out.println("color: " + r.getColor());
		System.out.println("borderwidth: " + r.getBorderWidth());
		r.area();

		Circle c = new Circle();

		c.setRadius(10);
		c.setColor("green");
		c.setBorderWidth(100);

		System.out.println("radius: " + c.getRadius());
		System.out.println("color: " + c.getColor());
		System.out.println("borderwidth: " + c.getBorderWidth());
		c.area();

		Triangle t = new Triangle();

		t.setBase(500);
		t.setHeight(200);
		t.setColor("blue");
		t.setBorderWidth(400);

		System.out.println("base: " + t.getBase());
		System.out.println("height: " + t.getHeight());
		System.out.println("color: " + t.getColor());
		System.out.println("borderwidth: " + t.getBorderWidth());
		t.area();
	}
}
