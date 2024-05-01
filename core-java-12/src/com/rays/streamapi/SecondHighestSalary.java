package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", 50000));
		employees.add(new Employee("Bob", 70000));
		employees.add(new Employee("Charlie", 60000));
		employees.add(new Employee("David", 80000));

		 double secondHighestSalary = employees.stream()
	                .map(e -> e.getSalary())
	                .distinct()
	                .sorted(Comparator.reverseOrder())
	                .skip(1) 
	                .findFirst()
	                .orElse( 0.0);
		    
		 System.out.println("Second highest salary: " + secondHighestSalary);
	}
}
