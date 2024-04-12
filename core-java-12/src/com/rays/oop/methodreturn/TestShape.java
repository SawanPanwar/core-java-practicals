package com.rays.oop.methodreturn;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);

		s[1] = Shape.getShape(2);

		s[2] = Shape.getShape(3);

		Rectangle r = (Rectangle) s[0];
		r.setLength(50);

		for (int i = 0; i < s.length; i++) {

			s[i].area();

		}

	}

}
