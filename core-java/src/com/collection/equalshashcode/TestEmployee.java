package com.collection.equalshashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);
		
		Employee e2 = new Employee(1, "abc", 100);

		System.out.println("Employee e1: " + e1);

		System.out.println("Employee e2: " + e2);

		System.out.println(e1.equals(e2));

		System.out.println(e1.hashCode());

		System.out.println(e2.hashCode());

		Set set = new HashSet();

		set.add(e1);

		set.add(e2);

		System.out.println("set: " + set);
		
		List list = new ArrayList();

		list.add(e1);

		list.add(e2);

		System.out.println("list: " + list.remove(new Employee(1, "abc", 100)));
	}
}