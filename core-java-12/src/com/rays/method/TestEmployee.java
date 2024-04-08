package com.rays.method;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e = new Employee();

		e.id = 100;

		e.name = "abc";

		Employee.name = "xyz";

		System.out.println(e.id);

		System.out.println(e.name);

		System.out.println(Employee.name);

		int i = e.sum(10, 20);

		System.out.println("i = " + i);

	}

}
