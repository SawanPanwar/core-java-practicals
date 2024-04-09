package com.rays.method;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise {

	public void armstrongNumber(int number) {

		int r = 0;

		int sum = 0;

		int n = number;

		while (n > 0) {

			r = n % 10;

			sum = sum + (r * r * r);

			n = n / 10;

		}

		if (sum == number) {

			System.out.println("Armstrong Number = " + number);

		} else {

			System.out.println("not Armstrong Number = " + number);

		}
	}

	public static void dateToString(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String str = sdf.format(date);

		System.out.println("String = " + str);

	}

	public static void arrayIndex(int[] arr, int a) {

		int index = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == a) {
				index = i;
			}

		}

		System.out.println("index = " + index);

	}

}
