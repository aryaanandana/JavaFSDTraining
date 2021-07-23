package com.ust.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriterExample {

	public static void main(String[] args) {
		
		File file =new File("file.txt");
		// writing file using buffer reader
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		try {
			fileWriter 	= new FileWriter(file);
			bufferedWriter=new BufferedWriter (fileWriter);
			bufferedWriter.write("this is an example \n");
			bufferedWriter.write("of using BufferedWriter \n" );
			bufferedWriter.write("BufferedWriter");
			bufferedWriter.flush();
			
					
			
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				if(fileWriter!=null) {
					fileWriter.close();
					
				}
			}
			catch(IOException e) {
				e.printStackTrace();
				
			}
		}
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
			fileReader=new FileReader(file);
			bufferedReader=new BufferedReader(fileReader);
			String line=null;
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
				
			}
			
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		finally {
			try
			{
				if(fileReader!=null) {
					fileReader.close();
				}
				if(bufferedReader!=null) {
					fileReader.close();
				}
				if (bufferedReader!=null) {
					bufferedReader.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
				
			}
		}
		
		
	}

}
