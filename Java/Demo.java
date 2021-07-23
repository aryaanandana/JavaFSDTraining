package com.ust.examples;

interface Emp{
	int eid=2101;
	void geteid();
}
 class implClass  implements Emp{
	 
	 public void geteid() {
		 System.out.println("Employee id is"+eid);
	 }
	 
 }

public class Demo {

	public static void main(String[] args) {
		
		implClass ob=new implClass();
		ob.geteid();
		
	}

}
