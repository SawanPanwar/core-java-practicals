package com.collection.equalshashcode;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public Employee() {
	}

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
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.id == emp.id && this.name == emp.name && this.salary == emp.salary;
	}

	@Override
	public int hashCode() {
		String str = id + " " + name + " " + salary;
		return str.hashCode();
	}

	@Override
	public String toString() {
		String str = id + " " + name + " " + salary;
		return str;
	}
}