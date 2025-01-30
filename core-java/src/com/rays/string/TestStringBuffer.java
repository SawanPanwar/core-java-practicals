package com.rays.string;

public class TestStringBuffer {

	public static void main(String[] args) {

		String str1 = "abc"; // immutable

		String str2 = "xyz";

		String str3 = str1 + str2;

		StringBuffer sb = new StringBuffer("abcde"); // mutable

		System.out.println(sb.capacity());

		sb.append("12345678912345678900");

		System.out.println(sb.capacity());
	}
}
