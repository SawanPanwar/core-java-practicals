package com.rays.exception;

public class TestCheckedPropagation {

	public static void main(String[] args) {

		dad();

	}

	public static void dad() {

		try {
			mom();
		} catch (CustomCheckedException e) {

			e.printStackTrace();
		}

	}

	public static void mom() throws CustomCheckedException {

		son();

	}

	public static void son() throws CustomCheckedException {

		CustomCheckedException e = new CustomCheckedException();

		throw e;

	}

}
