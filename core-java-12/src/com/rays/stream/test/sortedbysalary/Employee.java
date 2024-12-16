package com.stream.blog.sortedbysalary;

public class Employee {

	private int departmentId;
	private String name;

	public Employee(int departmentId, String name) {
		this.departmentId = departmentId;
		this.name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getName() {
		return name;
	}
}
