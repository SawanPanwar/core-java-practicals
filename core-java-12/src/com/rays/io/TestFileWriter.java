package com.rays.io;

import java.io.FileWriter;

public class TestFileWriter {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("C:\\Users\\Lenovo\\Desktop\\io\\write.txt", true);

		file.write(" xyz ");

		file.close();

	}

}
