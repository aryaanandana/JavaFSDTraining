package com.ust.examples;

enum Directions2{
	EAST("E"),
	WEST("W"),
	NORTH("N"),
	SOUTH("S")
	;
	
	/*MUST HAVE
	 * SEMICOLON AT THE END OF ENUM METHOD
	 * 
	 */
	private final String shortcode;
	Directions2(String code){
		this.shortcode=code;
		
	}
	public String getDirectionCode() {
		return this.shortcode;
		
	}
}

public class ExampleEnum3 {

	public static void main(String[] args) {
		Directions2 dir=Directions2.SOUTH;
		System.out.println(dir.getDirectionCode());
		Directions2 dir2=Directions2.EAST;
		System.out.println(dir2.getDirectionCode());
	
		
	}

}
