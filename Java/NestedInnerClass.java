package com.ust.examples;

public class NestedInnerClass {
	class inner{
		
		public void show() {
			System.out.println("in a nested class method");
		}
	}

	public static void main(String[] args) {
		NestedInnerClass.inner n=new NestedInnerClass().new inner();
		n.show();
		
		
		
	}

}
