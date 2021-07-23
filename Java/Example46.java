package com.ust.examples;

interface  Lion{
	public void animalSound();
	public void sleep();
	
	
}

 class Pig  implements Lion
 {
	 public void animalSound() {
		 System.out.println("the big says:wee weee");
	 }
	 public void sleep() {
		 System.out.println("Zzz");
	 }
	 
 }

public class Example46 {

	public static void main(String[] args) {
		
		Pig mypig=new Pig();
		mypig.animalSound();
		mypig.sleep();
		
	}

}
