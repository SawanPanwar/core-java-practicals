package com.rays.io.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args) throws Exception {

		FileReader file1 = new FileReader("C:\\Users\\Lenovo\\Desktop\\io\\file1.txt");

		FileReader file2 = new FileReader("C:\\Users\\Lenovo\\Desktop\\io\\file2.txt");

		BufferedReader br = new BufferedReader(file1);

		PrintWriter pw = new PrintWriter("C:\\Users\\Lenovo\\Desktop\\io\\file3.txt");

		String line = br.readLine();

		while (line != null) {
			pw.write(line);
			line = br.readLine();
		}

		br = new BufferedReader(file2);

		line = br.readLine();

		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		br.close();
		pw.close();
		System.out.println("Check your folder");

	}

}
