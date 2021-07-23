package com.ust.examples;

enum Operations{
	PLUS,
	MINUS,
	DIVIDE,
	MULTI,
	MODULUS
	;
	
	double calculate (double x,double y) {
		switch(this) {
		case PLUS:
			return x+y;
		case MINUS:
			return x-y;
		case DIVIDE:
			return x/y;
		case MULTI:
			return x*y;
		case MODULUS:
			return x%y;
			default:
				throw new AssertionError("unknown operation:"+this);
			
			
			
			
			
		}
		
	}
	
}

public class ExampleEnum5 {

	public static void main(String[] args) {
		
		Operations o1= Operations.DIVIDE;
		System.out.println(o1.calculate(12, 6));
		Operations o2=Operations.MULTI;
		System.out.println(o2.calculate(7, 3));
		Operations o3=Operations.MINUS;
		System.out.println(o3.calculate(73, 65));
		
		
		
		
		

	}

}
