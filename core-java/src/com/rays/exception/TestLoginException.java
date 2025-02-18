package com.rays.exception;

public class TestLoginException {

	public static void main(String[] args) {

		System.out.println("before");

		String login = "admin";
		String password = "admi";

		if (login.equals("admin") && password.equals("admin")) {

			System.out.println("login successfully..!!");

		} else {

			LoginException e = new LoginException("invalid");

			try {

				throw e;

			} catch (LoginException e1) {

				System.out.println(e1);

			}

		}

		System.out.println("after");

	}

}
