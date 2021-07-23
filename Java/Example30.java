package com.ust.examples;

class super_class{
	int num=20;
	
	//display method of super class
	public void display() {
		System.out.println("this is the display method of super class");
		
	}
}


public class Example30 extends super_class {
	int num=10;
	//display method of sub class
	public void display() {
		System.out.println("this is the sub method");
	}
	public void my_method()
	{
		
		Example30  sub=new Example30();
		sub.display();
		super.display();
		System.out.println("value of the variable named numin subclas:"+sub.num);

		System.out.println("value of the variable named numin super class:"+super.num);
		
	}
		


	public static void main(String[] args) {
		Example30 obj=new Example30();
		obj.my_method();
		
		
	}

}
