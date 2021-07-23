package com.ust.examples;

interface polygon{
	void getArea(int length,int breadth);
	

}
interface circle{
	void getArea(float radius);
}

class Radius implements  circle{
	
	public void getArea(float radius) {
		System.out.println("circle area is:"+(3.14*radius*radius));
	}
	}
		
	
	
		
class Rectangle implements polygon{
	
	public void getArea(int length,int breadth) {
		System.out.println("the area of the rectangle is"+(length*breadth));
		
	}
	
	class Square implements polygon{
		
		public void getArea(int l,int b) {
			System.out.println("the area of circle is:+(l*b");
		}
		
	}
	
}

public class Examplepolygon {
	
	public static void main(String[] arge) {
		Rectangle r1=new Rectangle();		
		r1.getArea(5,6);
		
		r1 .getArea(36, 2);
		Radius r=new Radius();
		r.getArea(8);
		
		
	}
	
	

}
