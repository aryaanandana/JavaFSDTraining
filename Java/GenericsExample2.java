package com.ust.examples;

public class GenericsExample2 {

	public static void main(String[] args) {
		
		//intialize the class with integer data
		DemoClass demo=new DemoClass();
		//generics method working with string
		demo.<String>genericsMethod("java programming");
		//generics method working with integer
		demo.<Integer>genericsMethod(25);
		
		
		

	}

}

class DemoClass{
	//create a generic method
	public<T> void  genericsMethod(T data) {
		System.out.println("generics method:");
		System.out.println("data passed:"+data);
	}
}