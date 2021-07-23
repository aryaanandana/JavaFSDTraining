package com.ust.examples;


import java.io.FileInputStream;

public class FileStream {

	public static void main(String[] args) {
		try {
			FileInputStream input=new  FileInputStream("D:File1.txt");
			System.out.println("data in the file");
			
			int i=input.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=input.read();
			}
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		
		
	}

}
