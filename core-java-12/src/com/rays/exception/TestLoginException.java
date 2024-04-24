package com.rays.exception;

public class TestLoginException {

	public static void main(String[] args)   {

		System.out.println("before");

		String name = "admi";

		try {
			if (name.equals("admin")) {
				System.out.println("valid user");
			} else {
				throw new LoginException("llllllllll");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

		System.out.println("after");

	}

}
