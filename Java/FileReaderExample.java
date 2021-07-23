package com.ust.examples;

//importing the file reader class

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		char[] array =new char[100];
		try {
			//creates a reader using file reader
			FileReader input=new FileReader("D:File1.txt");
			
			//reaches charcaters
			input.read(array);
			
			System.out.println("data in the file");
			
			System.out.println(array);
			
			//closes reader
			input.close();
			
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		
	}

}
