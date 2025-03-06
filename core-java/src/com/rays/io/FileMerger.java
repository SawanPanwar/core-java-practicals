package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("C:\\Users\\Lenovo\\Desktop\\io\\FileMerger.txt");

		for (int i = 1; i <= 5; i++) {

			FileReader file = new FileReader("C:\\Users\\Lenovo\\Desktop\\io\\AfterSplitFile" + i + ".txt");

			BufferedReader br = new BufferedReader(file);

			String line = br.readLine();

			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}
			br.close();
			file.close();
		}
		pw.close();
		System.out.println("Check your folder");
	}
}