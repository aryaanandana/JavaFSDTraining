package com.ust.examples;

import java.util.*;
import java.io.*;


public class ArrayToCollections {

	public static void main(String[] args)  throws IOException, NumberFormatException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many do you want to enter array");
		int n=Integer.parseInt(in.readLine());
		String []name =new String[n];
		
		for(int i=0;i<n;i++) {
			name[i]=in.readLine();
			

			}
		List<String>list=Arrays.asList(name);
		System.out.println();
		
		for(String li:list) {
			String str=li;
			System.out.println(str+" ");
			
		}
		
	}

}
