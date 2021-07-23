package com.ust.examples;
/*this example containdepicts the usage 
 * of local variable 
 * and instance variable
 * 
 * 
 * 
 * 
 */
public class Example1 {
	String name;//instance variable
	float price;
	static int count;
	
	public static void main (String[] args) {
		int age=10;
		System.out.println(age);
		Example1 e=new Example1();
		e.name="AryaANANDAN";
		count=6;
		System.out.println(e.name);
		System.out.println(count);
	}
	

}

