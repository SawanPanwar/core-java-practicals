package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		/*
		 * Employee e = new Employee(1, "abc", 100);
		 * 
		 * System.out.println("id: " + e.getId()); System.out.println("name: " +
		 * e.getName()); System.out.println("salary: " + e.getSalary());
		 * 
		 * System.out.println("Employee e: " + e);
		 */

		Employee e1 = new Employee(1, "ab", 100);
		Employee e2 = new Employee(2, "cd", 200);
		Employee e3 = new Employee(3, "ef", 300);
		Employee e4 = new Employee(4, "gh", 400);
		Employee e5 = new Employee(5, "ij", 500);
		Employee e6 = new Employee(6, "kl", 600);
		Employee e7 = new Employee(7, "mn", 700);
		Employee e8 = new Employee(8, "op", 800);
		Employee e9 = new Employee(9, "qr", 900);
		Employee e10 = new Employee(10, "st", 50);

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Employee emp = (Employee) it.next();

			System.out.println("id: " + emp.getId());
			System.out.println("name: " + emp.getName());
			System.out.println("salary: " + emp.getSalary());
		}

	}
}