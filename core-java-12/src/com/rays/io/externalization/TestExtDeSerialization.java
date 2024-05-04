package com.rays.io.externalization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestExtDeSerialization {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\io\\ExtObj.txt");

		ObjectInputStream in = new ObjectInputStream(file);

		Employee e = (Employee) in.readObject();

		System.out.println("id = " + e.id);
		System.out.println("name = " + e.name);
		System.out.println("address = " + e.address);
		System.out.println("salary = " + e.salary);

		in.close();
		file.close();

	}

}
