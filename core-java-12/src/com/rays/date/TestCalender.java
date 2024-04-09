package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalender {

	public static void main(String[] args) throws ParseException {

		//String str = "01-01-2002";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Calendar cal = Calendar.getInstance();

		//cal.setTime(sdf.parse(str));
		
		cal.add(Calendar.DATE, 2000);

		System.out.println(sdf.format(cal.getTime()));
	}

}
