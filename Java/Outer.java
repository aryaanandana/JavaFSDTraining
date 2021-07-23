package com.ust.examples;

public class Outer {
	private void getValue() {
		
		int sum=40;
		
		class inner{
			public int divisor;
			public int remainder;
			
			public inner()
			{
				divisor =4;
				remainder =sum%divisor;
				
			}
			private int getDivisor() {
				return divisor;
			}
			private int getRemainder()
			{
				return  sum%divisor;
			}
			
			private int getQuotient()
			{
				System.out.println("inside inner class");
				return sum/divisor;
			}
		}
		inner  Inner= new inner();
		System.out.println("Divisor="+ Inner.getDivisor());
		System.out.println("REmainder="+Inner.getRemainder());
		System.out.println("Quotient="+Inner.getQuotient());
		
		
	}
	
	public static void main(String[] args) {
		
	Outer o=new Outer();
	o.getValue();
		
		
		

	}

}
