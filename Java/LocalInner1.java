package com.ust.examples;

public class LocalInner1 {
	private int data=30;
	void display() {
		class local{
			void msg() {
				System.out.println(data);
			}
			
		}
		local l=new local();
		l.msg();
	}

	public static void main(String[] args) {
		LocalInner1 l1=new LocalInner1();
		l1.display();
		

	}

}
