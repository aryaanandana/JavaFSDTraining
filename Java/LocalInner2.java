package com.ust.examples;

public class LocalInner2 {
	private int data=30; //instance variable
	
	void display() {
		int value=50; //local variable must be final till jdk 1.7 only
		class local{
			void msg () {
				System.out.println(value);
				System.out.println(data);
			}
			
			
		}
		local l  =new local ();
		l.msg();
	}
	 

	public static void main(String[] args) {
		
		LocalInner2 obj=new LocalInner2();
		obj.display();
	
	}

}
