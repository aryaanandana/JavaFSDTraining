package com.ust.examples;
/*example for switch
 * 
 * 
 * 
 * 
 */

public class Example4 {

	public static void main(String[] args) {
		String colorcode="red";
		switch(colorcode) {
		default:
			System.out.println("go home");
			break;
		case "red":
			System.out.println("stop");
			break;
		case "green":
			System.out.println("go");
			break;
		case "yellow":
		System.out.println("ready");
		break;
		}

		
	}

}
