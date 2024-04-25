package com.rays.exception;

public class TestCustomUnChecked {

	public static void main(String[] args) {

		try {
			dad();
		} catch (CustomUnChecked e) {
			System.out.println("exception: " + e.getMessage());
		}
	}

	public static void dad() {

		mom();

	}

	public static void mom() {

		son();

	}

	public static void son() {

		CustomUnChecked e = new CustomUnChecked();

		throw e;

	}

}
