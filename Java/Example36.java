package com.ust.examples;

class base1{
final void foo(int i) {
	System.out.println(i);

}

void foo(int i,String s) {
	System.out.println(i+s);
	
}
}
class child extends base1{
	void foo(int i,String s) {
		System.out.println(i+"  "+s);
	}
}

public class Example36 {
	
	
	public static void main(String[] args) {
		
		
		
		
		child c=new child();
		c.foo(14);
		c.foo(14,"arya");
		
		
	}

}
