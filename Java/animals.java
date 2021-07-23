package com.ust.examples;

abstract class animalss{
	abstract void makesound();
	
}
class dogs extends animalss{
	public void makesound() {
		System.out.println("bark bark");
		
		
	}
	
}
class cat extends animalss{
	public void makesound() {
		System.out.println("meow meow");
	}
}
public class animals {

	public static void main(String[] args) {
		dogs d1=new dogs();
		d1.makesound();
		
		cat c1=new cat();
		c1.makesound();
		

	}

}
