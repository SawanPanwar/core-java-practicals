package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		list.add('g');
		list.add('h');

		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
			it.remove();
		}
		
		System.out.println(list);
	}
}