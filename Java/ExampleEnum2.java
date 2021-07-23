package com.ust.examples;

 enum Directions1{
	EAST,WEST,SOUTH,NORTH
}

public class ExampleEnum2 {
	Directions1 dir;
	public  ExampleEnum2(Directions1 dir) {
		this.dir=dir;
		
	}
	public void getMyDirections() {
		switch(dir) {
		case EAST:
			System.out.println("in east directions");
			break;
		case WEST:
			System.out.println("in west directions");
			break;
		case SOUTH:
			System.out.println("in south directions");
			break;
		case NORTH:
			System.out.println("in North directions");
			break;
			
			default:
				System.out.println("in south directions");
				break;
				
				
			
		
		
		}
	}

	public static void main(String[] args) {
		
		ExampleEnum2 obj1=new  ExampleEnum2(Directions1.EAST);
		obj1.getMyDirections();
		
		ExampleEnum2 obj2=new ExampleEnum2 (Directions1.SOUTH);
		obj2.getMyDirections();
	}

}
