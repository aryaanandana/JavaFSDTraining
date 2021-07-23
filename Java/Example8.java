package com.ust.examples;
/*
 * 
 * methods
 */

public class Example8 {
	int x;
	int y;
	int calc(int a,int b)//a and b are parameters
	{
		return a+b;
	}
	float calc(float a,float b){
		return a+b;
		//a and b parameters
	}
	String calc(String a,String b) {
		return a+b;
	}

	public static void main(String[] args) {
		Example8 e=new Example8();
		
		int x=e.calc(9,10);
		float y=e.calc(3.4f,4.6f);
		String z=e.calc("arya"," anandan");
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		

	}

}
