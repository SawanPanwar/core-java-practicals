package com.rays.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("one", "two", "three", "four");

		Stream<String> s = list.stream();

		s.map(e -> e.toUpperCase())
		.filter(e -> e.startsWith("T"))
		.sorted()
		.forEach(e -> {
			System.out.println(e);
		});
	}
}