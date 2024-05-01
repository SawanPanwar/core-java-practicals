package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestDuplicates {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('a');
		list.add('b');
		list.add('g');
		list.add('h');

		Set s = new HashSet();

		List duplicates = new ArrayList();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Object obj = it.next();

			if (s.add(obj)) {

			} else {
				duplicates.add(obj);
			}
		}

	}

}
