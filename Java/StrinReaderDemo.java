package com.ust.examples;

import java.io.IOException;
import java.io.StringReader;

public class StrinReaderDemo {

	public static void main(String[] args) {
		String str="Hello World! \n this is string reader program";
		StringReader sr=new  StringReader(str);
		int i=0;
		try {
			while((i=sr.read())!=-1) {
				System.out.print((char)i);
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
