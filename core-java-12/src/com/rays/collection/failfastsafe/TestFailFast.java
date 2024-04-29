package com.rays.collection.failfastsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');

		Iterator it = list.iterator();

		list.add(100);

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
