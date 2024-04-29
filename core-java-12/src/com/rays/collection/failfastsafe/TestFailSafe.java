package com.rays.collection.failfastsafe;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add('a');
		v.add('b');
		v.add('c');
		v.add('d');
		v.add('e');

		Enumeration e = v.elements();
		
		v.add(100);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}
