package com.rays.collection.comparator;

import java.util.Comparator;

public class OrderByIdDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getId() - o1.getId();
	}

}
