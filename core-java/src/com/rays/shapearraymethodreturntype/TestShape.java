package com.rays.shapearraymethodreturntype;

public class TestShape {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];

		shape[0] = Shape.getShape(1); // new Rectangle();

		shape[1] = Shape.getShape(2); // new Circle();

		shape[2] = Shape.getShape(3); // new Triangle();

		Rectangle r = (Rectangle) shape[0];
		r.setLength(10);
		r.setWidth(20);

		Circle c = (Circle) shape[1];
		c.setRadius(10);

		Triangle t = (Triangle) shape[2];
		t.setBase(20);
		t.setHeight(10);

		for (int i = 0; i < shape.length; i++) {
			shape[i].area();
		}
	}
}
