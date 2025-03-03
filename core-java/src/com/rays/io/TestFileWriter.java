package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter out = new FileWriter("C:\\Users\\Lenovo\\Desktop\\io\\abc.txt");
		
		out.write("hello\n");
		
		out.write("how are you?");
		
		out.close();
	}
}