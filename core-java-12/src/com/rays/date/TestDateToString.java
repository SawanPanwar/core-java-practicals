package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateToString {

	public static void main(String[] args) {

		Date today = new Date();

		System.out.println("Date = " + today);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String str = sdf.format(today);

		System.out.println("String = " + str);

	}
}
