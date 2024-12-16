package com.stream.blog.sortedbysalary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesByDepartmentId {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(3, "Ram"));
		employees.add(new Employee(2, "Shyam"));
		employees.add(new Employee(1, "Jay"));
		employees.add(new Employee(4, "Vijay"));

		List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparingInt(Employee::getDepartmentId))
				.collect(Collectors.toCollection(ArrayList::new));

		sortedEmployees.forEach(e -> System.out.println(e.getDepartmentId() + " : " + e.getName()));

	}

}
