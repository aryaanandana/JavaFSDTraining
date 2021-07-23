package com.ust.examples;
/*program for 
 * loop
 * 
 * 
 * 
 */

public class Example3 {

	public static void main(String[] args) {
		
		//String[] str=new String[5];
		String[] str = {"arya","alona","sarmada","akhila","aryaraj"};
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("akhila")) 
				continue;
				System.out.println(str[i]);
			}
		}

	}


