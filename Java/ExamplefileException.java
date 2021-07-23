package com.ust.examples;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ExamplefileException {

	public static void main(String[] args) {
		try {
			File f =new File("D:File1.txt");
			//FileWriter f=new  FileWriter ("D:File1.txt");
			
			/*
			if(f.createNewFile()) {
				System.out.println(f.getName()+"is  created");
			
			}else {
				System.out.println("already exist");
				
			}*/
			
			
			//f.write("this is java class");
			//f.close();
			
			
			//Scanner read=new Scanner(f);
			
			/*while(read.hasNextLine()) {
				String data=read.nextLine();
				System.out.println(data);
			}*/
			FileReader read=new  FileReader(f);
			
			int ch;
			while((ch=read.read())!=-1) {
				System.out.print((char)ch);
				
			}
			read.close();
			
			}
			catch(IOException e) {
				System.out.println("Exception occured");
			
		}
		
	
	}

}
