package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();
		s.add("c");
		s.add("a");
		s.add("b");
		// s.add(null); //throw null pointer exception
		// s.add(100); //throw class caste exception

		// Elements are automatically sorted in ascending order.
		System.out.println(s);

		// get first element (One)
		System.out.println(s.first());

		// get last element (Two)
		System.out.println(s.last());

	}
}
