package com.ust.lamda;

import java.util.ArrayList;
import java.util.List;

import com.ust.lamda.LambdaExample3.GreetingService;

public class Lamdaexample4 {

	public static void main(String[] args) {
		List<String> pointList = new ArrayList();
		 
		pointList.add("14");
		pointList.add("25");
		pointList.add("anand");
		 
		pointList.forEach(p ->  { System.out.println("msg"+p); } );
		pointList greetService=add->System.out.println("hello"+add);
		greetService.add("arya");
		
		


	}

}
interface  pointList{
	void add(String message);
	
}