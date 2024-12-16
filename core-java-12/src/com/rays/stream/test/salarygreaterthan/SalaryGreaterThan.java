package com.stream.blog.salarygreaterthan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryGreaterThan {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Ram", 25000));
		employees.add(new Employee("Shyam", 18000));
		employees.add(new Employee("Jai", 30000));
		employees.add(new Employee("Vijay", 22000));

		List<Employee> highPaidEmployees = employees.stream().filter(employee -> employee.getSalary() > 20000)
				.collect(Collectors.toCollection(ArrayList::new));

		highPaidEmployees.forEach(e -> System.out.println(e.getName() + " - Salary: " + e.getSalary()));

	}

}
