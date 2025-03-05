package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestCorrectEmail {

	public static void main(String[] args) throws Exception {

		FileReader read = new FileReader("C:\\Users\\Lenovo\\Desktop\\io\\Emails.txt");

		BufferedReader in = new BufferedReader(read);

		FileWriter write = new FileWriter("C:\\Users\\Lenovo\\Desktop\\io\\CorrectEmails.txt");

		PrintWriter out = new PrintWriter(write);

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String line = in.readLine();

		while (line != null) {

			if (line.matches(emailreg)) {

				out.println(line);

			}

			line = in.readLine();

		}

		out.close();
		in.close();
		System.out.println("done");
	}
}