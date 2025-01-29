package com.rays.string;

public class ParseStringsIntoPrimitiveData {

	public static void main(String[] args) {

		byte bt = Byte.parseByte("1");
		System.out.println("byte value " + bt);

		short s = Short.parseShort("2");
		System.out.println("short value " + s);

		int i = Integer.parseInt("3");
		System.out.println("int value " + i);

		long l = Long.parseLong("4444");
		System.out.println("long value " + l);

		float f = Float.parseFloat("5.2");
		System.out.println("float value " + f);

		double d = Double.parseDouble("5.5");
		System.out.println("double value " + d);

		boolean b = Boolean.parseBoolean("true");
		System.out.println("boolean value " + b);

		char ch = "c".charAt(0);
	}
}