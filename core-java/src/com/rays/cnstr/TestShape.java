package com.rays.cnstr;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.setColor("black");
		s.setBorderWidth(10);

		Shape s2 = new Shape("red", 100);

		System.out.println(s2.getColor());

		s2.setColor("orange");

		System.out.println(s2.getColor());

		System.out.println(s2.getBorderWidth());
	}
}
