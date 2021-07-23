package com.ust.examples;

import java.io.File;

public class FilenameChange {

	public static void main(String[] args) {
		
		//creates a file objects
		
		//creates a file
		try {
			
			File file=new File("D:File3.txt");
			file.createNewFile();
			File newFile =new File("D:File33.txt");
			//change name of file
			boolean value=file.renameTo(newFile);
			
			if(value) {
				System.out.println("The name of the file changed");
			}
			else {
				System.out.println("The name cannot be   changed");
			}
			
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		//creates an object that contains the new name of file
		
	}

}
