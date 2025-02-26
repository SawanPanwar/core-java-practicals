package com.collection.comparator;

import java.util.Comparator;

public class OrderByNameDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e2.name.compareTo(e1.name);
	}

}
