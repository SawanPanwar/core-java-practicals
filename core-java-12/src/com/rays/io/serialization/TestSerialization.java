package com.rays.io.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\io\\obj.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		Marksheet m = new Marksheet();
		m.id = 10;
		m.name = "yash";
		m.physics = 89;
		m.chemistry = 99;
		m.maths = 81;
		m.total = m.physics + m.chemistry + m.maths;

		out.writeObject(m);

		out.close();
		file.close();

		System.out.println("Object write successfully....!!!");
		System.out.println("total = " + m.total);

	}

}
