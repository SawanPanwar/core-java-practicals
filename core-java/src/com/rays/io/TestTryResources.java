package com.rays.io;

import java.io.FileReader;

public class TestTryResources {

	public static void main(String[] args) throws Exception {

		try (FileReader in = new FileReader("C:\\Users\\Lenovo\\Desktop\\io\\hello.txt")) {

			int ch = in.read();

			while (ch != -1) {

				System.out.print((char) ch);

				ch = in.read();

			}
		}
	}
}