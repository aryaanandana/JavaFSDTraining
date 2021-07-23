package com.ust.examples;


interface Firstinterfaces1{
	
	public void myMethod();
	
}

interface Secondinterface1{
	public void myOtherMethod();
	
}
 class AdemoClass implements Firstinterfaces1,Secondinterface1{
	 
	 public void myMethod() {
		 System.out.println("some  text....");
		 
	 }
	 public void myOtherMethod() {
		 System.out.println("some othe text");
		 
	 }
 }
 
public class FirstInterface {

	public static void main(String[] args) {
		AdemoClass myobj=new AdemoClass();
		myobj.myMethod();
		myobj.myOtherMethod();
		
		
		

	}

}
