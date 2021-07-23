package com.ust.examples;

public class Example45 {
	
	void outerMethod() {
		System.out.println("inside outer method");
		//inner class is local to outermethod()
		
		class inner{
			void innerMethod() {
				System.out.println("inside inner method");
			}
		}
		inner y=new inner();
		y.innerMethod();
	}

	public static void main(String[] args) {
		Example45 outer=new Example45();
		outer.outerMethod();
		

	}

}
