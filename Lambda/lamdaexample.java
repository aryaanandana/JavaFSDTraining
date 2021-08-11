package com.ust.lamda;

import java.util.ArrayList;

import java.util.List;

public class lamdaexample {

	public static void main(String[] args) {
		
        HelloWorld mylambda1= (String s) -> {System.out.println("Hello 1 "+s);};
        
        HelloWorld mylambda2=  s -> {System.out.println("Hello 2 "+s);};
        
        mylambda1.greet("World");
        mylambda2.greet("JIP");

		
		
		
	}

}
interface HelloWorld{
	

    public void greet(String welcome);

}

/*List<String> pointList = new ArrayList();
 
pointList.add("1");
pointList.add("2");
 
pointList.forEach(p ->  { System.out.println(p); } );
}*/
