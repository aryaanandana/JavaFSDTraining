package com.ust.examples;

interface Employee

{
	int eid=6060;
	void geteid();
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		
		Employee ob=new Employee() {
			public void geteid() {
				System.out.println("Employee id is:"+eid);
				
			}
		};
		ob.geteid();
		
		
	}

}
