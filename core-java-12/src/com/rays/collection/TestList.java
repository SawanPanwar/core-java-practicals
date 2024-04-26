package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');

		System.out.println("list => " + list);

		list.add(2, "one");

		System.out.println("list => " + list.get(2));

		list.remove(2);

		System.out.println("list => " + list);

		list.set(2, "one");

		System.out.println("list => " + list);

		System.out.println("list indexOf => " + list.indexOf('a'));

		System.out.println(list.subList(0, 3));

	}

}
