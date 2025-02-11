package com.rays.shapearraymethodreturntype;

public class Shape {

	public void area() {
		System.out.println("Shape Area Method");
	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Rectangle();
		}

		if (i == 2) {
			return new Circle();
		}

		if (i == 3) {
			return new Triangle();
		}

		return new Shape();
	}
}