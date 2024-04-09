package com.rays.method;

public class TestTypeCasting {

	public static void main(String[] args) {

		long l = 10;

		int i = (int) l;

		String str1 = "100";
		
		int a = Integer.parseInt(str1);
		
		String.valueOf(a);

		String str2 = "200";

		System.out.println(str1 + str2);

		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		
		
	}

}
