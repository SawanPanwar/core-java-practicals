package com.collection.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class TestSetEqualsHashcode {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);
		Employee e2 = new Employee(2, "xyz", 100);
		Employee e3 = new Employee(3, "aaa", 100);
		Employee e4 = new Employee(4, "bbb", 100);
		Employee e5 = new Employee(5, "ccc", 100);
		Employee emp = new Employee(3, "aaa", 100);

		Set s = new HashSet();

		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		s.add(emp);

		System.out.println("set: " + s);
	}
}