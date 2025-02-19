package com.rays.exception;

public class TestUncheckedPropagation {

	public static void main(String[] args) {

		dad();

	}

	public static void dad() {

		try {
			mom();
		} catch (CustomUncheckedException e) {

			e.printStackTrace();
		}

	}

	public static void mom() {

		son();

	}

	public static void son() {

		CustomUncheckedException e = new CustomUncheckedException();

		throw e;

	}

}
