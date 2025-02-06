package com.rays.override;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.area();

		Rectangle r = new Rectangle();

		r.area();

		Shape shape = new Rectangle();
		
		shape.area();

	}

}
