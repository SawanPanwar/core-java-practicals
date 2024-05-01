package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {

	public static void main(String[] args) {

		List<Contestent> list = new ArrayList<>();
		list.add(new Contestent("umakant", "98878787877"));
		list.add(new Contestent("satyam", "9899787877"));
		list.add(new Contestent("rahul", "9887878787"));
		list.add(new Contestent("gorav", "9887878177"));
		list.add(new Contestent("shubham", "9800787877"));
		list.add(new Contestent("riya", "7270787877"));
		list.add(new Contestent("abc", "988877"));
		list.add(new Contestent("xyz", "11878787877"));
		list.add(new Contestent("rani", "7270787877"));
		list.add(new Contestent("umesh", "9887878787"));

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> {
					System.out.println(e);
				});

	}
}
