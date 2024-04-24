package com.rays.exception;

public class LoginException extends Exception {

	public LoginException() {

		super("Login & Password invalid..!!!");

	}

	public LoginException(String msg) {

		super(msg);

	}

}
