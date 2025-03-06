package com.rays.exception;

public class TryCatchFinally {

	public static void main(String[] args) {

		int a = 10;

		int b = 0;

		String name = null;

		try {

			int c = a / b;
			
			System.out.println("Division = " + c);

			System.out.println(name.length());

		} catch (ArithmeticException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			System.exit(0);

		} catch (NullPointerException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {
			System.out.println("finally block");
		}
	}
}
