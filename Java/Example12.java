package com.ust.examples;
/*
 *switch example 2
 */

public class Example12 {

	public static void main(String[] args) {
		char ch='x';
		switch(ch)
		{
		case'd':
			System.out.println("case 1");
			break;
		case'b':
			System.out.println("case 2");
			break;
		case'x':
			System.out.println("case 3");
			break;
		case 'z':
			System.out.println("case 4");
			break;
			default:
				System.out.println("default");
		}
	}

}
