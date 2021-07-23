package com.ust.examples;
/*
 * 
 * hierarichal inheritance
 */

class A{
	public void print_A()
	{
		System.out.println("class A");
		
	}
}
	class B extends A{
		public void print_B() {
			System.out.println("class b");
			
		}
	}
		class c extends A{
			public void print_c() {
				System.out.println("class c");
			}
		}
			class d extends A{
				public void print_d() {
					System.out.println("class d");
				}
			}
		
	

public class Example28 {

	public static void main(String[] args) {
		
		B obj_b=new B();
		obj_b.print_A();
		obj_b.print_B();
		
		c obj_c=new c();
		obj_c.print_A();
		obj_c.print_c();
		
		d obj_d=new d();
		obj_d.print_A();
		obj_d.print_d();
	}
}
		
		
		
	
		
		
		
		
	


