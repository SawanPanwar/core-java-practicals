package com.collection.comparable;

public class Employee implements Comparable<Employee> {

	public int id;
	public String name;
	public int salary;

	int count = 0;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}

	@Override
	public int compareTo(Employee e) {

		int diff = this.id - e.id;

		System.out.println("this: " + this.id + " e: " + e.id + " diff: " + diff);

		// return this.id - e.id;

		// return e.name.compareTo(this.name);

		if (this.id == e.id) {
			return e.name.compareTo(this.name);
		}
		return this.id - e.id;
	}
}