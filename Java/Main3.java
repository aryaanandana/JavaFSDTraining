package com.ust.examples;

public class Main3 {

	public static void main(String[] args) {
		//parent try block
		try {
			//child try block
			try {
				System.out.println("inside block1");
				int b=45/0;
				System.out.println(b);
				
			}
			catch(ArithmeticException e1) {
				System.out.println("Exception:e1");
			}
			//child try block
			try {
				System.out.println("inside block2");
				int b=45/0;
				System.out.println(b);
			}
			
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception:e2");
				
			}
			System.out.println("just other statement");
			
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic Ecxeption");
			System.out.println("inside parent try catch block");
			
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			
			System.out.println("inside parent try catch block");
			
			
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("inside parent try catch block");
			
		}
		System.out.println("Next statement...");
		
	}

}
