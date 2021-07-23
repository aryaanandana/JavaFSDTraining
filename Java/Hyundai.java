package com.ust.examples;
/*
 * 
 * abstract class
 */
abstract class car{
	int x;
	abstract void insurancedetails();
	void display() {}
	
}



public class Hyundai extends car {
	void insurancedetails() {
		System.out.println("please provide insurance formula");
		
	}

	public static void main(String[] args) {
		
	Hyundai h =new Hyundai();
	car c =new Hyundai();
	c.insurancedetails();
	h.insurancedetails();
		
	}

}

