package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCustomCalender {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = "01-01-2025";

		Date date = sdf.parse(strDate);

		Calendar cal = Calendar.getInstance();

		cal.setTime(date);

		cal.add(Calendar.DATE, 30);

		Date nextEvent = cal.getTime();

		System.out.println(sdf.format(nextEvent));

	}
}
