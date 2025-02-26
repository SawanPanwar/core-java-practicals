package com.collection.comparator;

import java.util.Comparator;

public class OrderByIdDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e2.id - e1.id;
	}

}