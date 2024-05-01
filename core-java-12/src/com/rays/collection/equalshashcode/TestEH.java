package com.rays.collection.equalshashcode;

public class TestEH {

	public static void main(String[] args) {

		/*
		 * String s1 = "abc";
		 * 
		 * String s2 = "abc";
		 * 
		 * System.out.println(s1.equals(s2));
		 * 
		 * System.out.println(s1.hashCode());
		 * 
		 * System.out.println(s2.hashCode());
		 */

		Employee e1 = new Employee(1, "abc", 1000);

		Employee e2 = new Employee(1, "abc", 1000);

		Employee e3 = null;

		String s = "abc";

		System.out.println(e1.equals(s));

		System.out.println(e1.hashCode());

		System.out.println(e2.hashCode());
	}

}
