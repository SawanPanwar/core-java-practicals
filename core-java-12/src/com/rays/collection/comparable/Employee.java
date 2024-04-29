package com.rays.collection.comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {

		if (this.name == o.name) {
			return this.salary - o.salary;
		}

		return this.id - o.id;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

}
