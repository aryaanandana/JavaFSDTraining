package com.ust.examples;

 enum Directions{
	EAST,
	WEST,
	NORTH,
	SOUTH
}

public class ExampleEnum1 {

	public static void main(String[] args) {
		 Directions dir= Directions.NORTH;
		 if(dir== Directions.EAST) {
			 System.out.println(" Directions:East");
			 
		 }else  if(dir== Directions.WEST) {
			 System.out.println(" Directions:West");
			 
			 
		 }
		 else if(dir== Directions.NORTH) {
			 System.out.println(" Directions:North");
			 
		 }else if(dir==Directions.SOUTH) {
			 System.out.println("Directions:South");
		 }
			 
		 
		

	}

}
