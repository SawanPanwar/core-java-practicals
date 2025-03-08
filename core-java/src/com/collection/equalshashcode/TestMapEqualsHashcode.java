package com.collection.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class TestMapEqualsHashcode {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);
		Employee e2 = new Employee(1, "abc", 100);
		Employee e3 = new Employee(3, "aaa", 100);
		Employee e4 = new Employee(4, "bbb", 100);
		Employee e5 = new Employee(5, "ccc", 100);

		Map map = new HashMap();

		map.put(e1, "one");
		map.put(e2, "two");

		System.out.println("map: " + map);
	}
}