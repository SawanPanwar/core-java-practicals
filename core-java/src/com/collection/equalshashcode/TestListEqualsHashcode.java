package com.collection.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class TestListEqualsHashcode {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);
		Employee e2 = new Employee(2, "xyz", 100);
		Employee e3 = new Employee(3, "aaa", 100);
		Employee e4 = new Employee(4, "bbb", 100);
		Employee e5 = new Employee(5, "ccc", 100);

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		System.out.println("list: " + list);

		Employee emp = new Employee(3, "aaa", 100);

		System.out.println("list: " + list.remove(emp));

		System.out.println("list: " + list);
	}
}