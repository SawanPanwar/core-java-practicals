package com.rays.inheritance;

public class TestShapeTypeCasting {

	public static void main(String[] args) {

		Shape s = new Shape();

		Rectangle r = new Rectangle();

		Circle c = new Circle();

		Triangle t = new Triangle();

		Shape shape = new Rectangle();

		shape.setColor("red");

		Rectangle rectangle = (Rectangle) shape;
		
		rectangle.setColor("abc");
		
		System.out.println(rectangle.getColor());

	}
}
