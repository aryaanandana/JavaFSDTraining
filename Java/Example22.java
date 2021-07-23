package com.ust.examples;

public class Example22 {
	String fname;
	String lname;
	String city;
	String address;
	String dob;
	Float salary;
	
	Example22(String x,String y,String z,String w,String v,Float u){
		fname=x;
		lname=y;
		city=z;
		address=w;
		dob=v;
		
		salary=u;
	}
	 void display(){
		System.out.println(fname+" "+lname+" "+city+" "+address+" "+dob+" "+salary);
	}

	public static void main(String[] args) {
		
		Example22 e1=new Example22("arya","anandan","saianand","ctd","16/02/2021",2300.0f);
		Example22 e2=new Example22("arya","anandan","saianand","mnk","17/02/2021",2500.0f);
		Example22 e3=new Example22("arya","anandan","saianand","mnk","17/02/2021",2500.0f);
		Example22 e4=new Example22("ammu","anandan","nbhgg","mnk","17/02/2021",2500.0f);
		Example22 e5=new Example22("arya","anandan","saianand","mnk","17/02/2021",2500.0f);
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();	}

}
