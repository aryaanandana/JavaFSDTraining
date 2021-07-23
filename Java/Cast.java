package com.ust.examples;

public class Cast {

	public static void main(String[] args) {
		double num=15.64;
		System.out.println(num);
		
		int n=(int)num;//down casting double 8 into int 4
		System.out.println(n);
		
		int a=23;
		System.out.println(a);
		
		double b=263;// upcasting the int 4 to double 8
		System.out.println(b);	
		
		double c=23.6;
		System.out.println(c);
		
		float f=(float)6.3;
		byte bt =(byte)f;
		System.out.println(bt);
		
		long l=7536;
		float f1=(float)l;
		System.out.println(f1);
		
		int x=12;
		String dbValue=String.valueOf(x);
		System.out.println(dbValue);
		
		dbValue =String.valueOf(l);
		System.out.println(l);
		
		dbValue =String.valueOf(x);
		System.out.println(x);
		
		dbValue =String.valueOf(num);
		System.out.println();
		
		
		
		

	}

}
