package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\customLogo.jpg");

		FileOutputStream out = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\io\\rays.jpg");

		int ch = in.read();

		while (ch != -1) {

			System.out.print((char) ch);

			out.write(ch);

			ch = in.read();

		}

		out.close();
		in.close();

	}

}
