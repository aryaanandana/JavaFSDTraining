package com.ust.examples;

class GenericsClass3 <T extends Number>{
	public void display() {
		System.out.println("This is a bounded type generics");
		
	}
}

public class GenericsExample3 {

	public static void main(String[] args) {
		
		//creates an object of genericsclass
		GenericsClass3<Integer> obj=new GenericsClass3<>();
		obj.display();
		
		
	}

}
