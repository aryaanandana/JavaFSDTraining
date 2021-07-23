package com.ust.examples;

abstract class sum{
	
	public abstract int sumOfTwo(int n1,int n2);
	public abstract int sumofthree(int n1,int n2,int n3);
	
	public void disp() {
		System.out.println("method of class sum");
		
	}
}
class demo11 extends sum{
	public int  sumOfTwo(int num1,int num2) {
		return num1+num2;
	}
	
	public int  sumofthree(int num1,int num2,int num3) {
		return num1+num2+num3;
				
	}
}
public class Example35 {
	
	

	public static void main(String[] args) {
		sum e1 =new demo11();
		System.out.println(e1.sumOfTwo(3,7));
		System.out.println(e1.sumofthree(45,5,89));
		e1.disp();		
		
	}

}