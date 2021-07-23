package com.ust.examples;

class calculation{
	int z;
	
	public void addition(int x,int y) {
		z=x+y;
	System.out.println("the sum of the given numbers:"+z);
	
		
	}
	
	public void subtraction (int x ,int y) {
	z=x-y;
	System.out.println("the sub of two numbers:"+z);
	
}
}
	public class Example29 extends calculation{
		public void multiplication(int x,int y)
		{
			z=x*y;
			System.out.println("the production of two numbers:"+z);
			
		}
	

	

	public static void main(String[] args) {
		int a=20,b=10;
		
		Example29 demo=new Example29();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		
	}}

