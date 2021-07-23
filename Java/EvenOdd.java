package com.ust.examples;


import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int num;
		System.out.println("enter a number");
		
		Scanner input=new Scanner(System.in);
		 num=input.nextInt();
		 
		 if(num%2==0) {
			 System.out.println("number is even");
			
		 }
		 else {
			 System.out.println("number is odd");
		 }
		

	}

}
