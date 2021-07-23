package com.ust.examples;

public class Example34 {
	
	final static String name="CONFIG";
	final long initTime;
	Example34()
	{
		this.initTime=System.currentTimeMillis();
		
	}
	public static void main(String[] args) {
		
		Example34 	 e1=new Example34();
		System.out.println(e1.initTime);
		Example34 	 e2=new Example34();
		System.out.println(e2.initTime);

	}

}
