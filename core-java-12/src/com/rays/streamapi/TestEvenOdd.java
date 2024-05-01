package com.rays.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestEvenOdd {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 5, 8, 10, 11 };

		IntStream stream = Arrays.stream(arr);

		stream.filter(e -> e < 5).distinct().sorted().forEach(e -> {
			System.out.println(e);
		});

	}

}
