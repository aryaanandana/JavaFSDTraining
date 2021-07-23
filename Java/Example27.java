package com.ust.examples;

class animal{
	String name;
	
	public void eat()
	{
		System.out.println("i can eat");
	}
}

class dog extends animal{
	
	public void display() {
		System.out.println("name"+name);
		
	}
	
}
public class Example27 {

	public static void main(String[] args) {
		
		dog d=new dog();
		d.name="-- labr";
		d.eat();
		d.display();
		


	}

}
