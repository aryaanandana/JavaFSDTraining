package com.ust.examples;

/*this is the copy constructor it copy the value of one object 
 * to another object (the object that invokes the constructor
 * 
 * 
 */


public class Example23 {
	
	String web;
Example23(String w){
	web=w;
	
}
Example23(Example23 cc){
	web=cc.web;
	
}
void display() {
	System.out.println("Constructor:"+web);
}

	public static void main(String[] args) {
		Example23 obj1=new Example23 ("example of copy constructor in java");
		
		Example23 obj2=new Example23(obj1);
		
		obj1.display();
		obj2.display();
		
	}

}
