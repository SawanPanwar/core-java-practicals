package com.rays.oop;

import com.rays.oop.Shape;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.setColor("red");
		s.setBorderWidth(100);

		System.out.println(s.getColor());

		System.out.println(s.getBorderWidth());

	}
}
