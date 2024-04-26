package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {

		Set s1 = new HashSet(); // unorderd collection

		s1.add(1);
		s1.add("one");
		s1.add(1);
		s1.add(null);
		s1.add(null);

		System.out.println("set => " + s1);

	}

}
