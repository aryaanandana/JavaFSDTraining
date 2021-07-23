package com.ust.examples;
/*
 * 
 * Single inheritance
 */

class one{
	public void print_greek()
	{
		System.out.println("geeks");
		
		
	}
}
	class two extends one{
		public void print_for()
		{
			System.out.println("for");
			
		}
	}

public class SingleInheritance {

	public static void main(String[] args) {
		
		two g=new two();
		g.print_for();
		g.print_greek();
		g.print_greek();
	}

}
