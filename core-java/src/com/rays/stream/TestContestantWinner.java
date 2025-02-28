package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		ArrayList<ContestantWinner> list = new ArrayList<ContestantWinner>();

		list.add(new ContestantWinner("Hritika", "8978645671"));
		list.add(new ContestantWinner("Jayesh", "8978645671"));
		list.add(new ContestantWinner("Brajesh", "9998645671"));
		list.add(new ContestantWinner("Dinesh", "8978641111"));
		list.add(new ContestantWinner("Aryan", "8955555671"));
		list.add(new ContestantWinner("Shivanshi", "8978666666"));
		list.add(new ContestantWinner("Preksha", "9911645671"));
		list.add(new ContestantWinner("Yash", "7771865671"));
		list.add(new ContestantWinner("Pranav", "8978600071"));
		list.add(new ContestantWinner("abc", "12345"));

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> {
					System.out.println(e); // System.out::println
				});

	}

}
