package com.ust.examples;

public class Example33 {
	final void display()
	{
		System.out.println("base method called");
	
	}
}

	class  derived extends Example33{
		void disply()
		{
			System.out.println("base method called");
		}
	
	
	public static void main(String[] args) {
		derived d=new derived();
		d.display();
	}
		

	}

