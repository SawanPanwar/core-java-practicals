package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(100);
		list.add("one");
		list.add("two");
		list.add("three");

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=========================================================");

		for (Object obj : list) {
			System.out.println(obj);
		}

		System.out.println("=========================================================");

		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}

	}
}
