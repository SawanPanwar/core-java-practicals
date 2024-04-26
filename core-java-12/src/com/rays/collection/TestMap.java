package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");

		System.out.println(map);

		// map.clear();
		map.remove(1);
		System.out.println(map);

		// Retrieve and print values based on keys
		System.out.println(map.get(4));

		// Check if a key is present in the map
		System.out.println(map.containsKey(4));

	}

}
