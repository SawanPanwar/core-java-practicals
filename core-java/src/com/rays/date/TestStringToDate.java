package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringToDate {

	public static void main(String[] args) throws ParseException {

		String str = "28-01-2025";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date d = sdf.parse(str);

		System.out.println(d);

	}
}
