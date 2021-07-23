package com.ust.examples;
/*
 * 
 * 
 */
import java.io.*;

public class Example24 {
	String name;
	int id;
	
	
	Example24(String name,int id){
		this.name=name;
		this.id=id;
	}
	

	public class ParameterizedConstructor{
		
	}
	public static void main(String[] args) {
		Example24 e1=new Example24("arya annad",101);
		System.out.println("Student name:"+e1.name+" and student id:"+e1.id);
		
	}

}
