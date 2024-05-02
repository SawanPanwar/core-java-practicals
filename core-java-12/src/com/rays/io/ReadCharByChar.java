package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharByChar {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\Lenovo\\Desktop\\io\\hello.txt");

		int ch = file.read();

		while (ch != -1) {

			System.out.print((char) ch);

			ch = file.read();

		}

		file.close();

	}

}
