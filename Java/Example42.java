package com.ust.examples;
/*
 * 
 * 
 * 
 * Example of inner class
 */

public class Example42 {
	
	private int x;
	
	void display() {
		System.out.println("example");
		
	}
	
	 private class inner{
		void display() {
			System.out.println("this is inner class");
		}
	}

	public static void main(String[] args) {
		
		Example42.inner e1=new Example42().new inner();
		e1.display();
		
		Example42 e2=new Example42();
		e2.x=16;
		System.out.println(e2.x);
		e2.display();
		

	}

}
