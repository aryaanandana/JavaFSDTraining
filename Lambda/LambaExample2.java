package com.ust.lamda;
import java.lang.FunctionalInterface;
@FunctionalInterface
interface  MyInterface{
	double getPiValue();
	
}

public class LambaExample2 {

	public static void main(String[] args) {
	
		MyInterface ref;
		
		ref=()->3.1415;
		System.out.println("value of pi="+ref.getPiValue());
	}

}
