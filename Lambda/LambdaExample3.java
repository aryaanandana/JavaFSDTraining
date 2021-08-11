package com.ust.lamda;

public class LambdaExample3 {

	public static void main(String[] args) {
		LambdaExample3 tester=new LambdaExample3();
		MathOperation addition =(int a,int b)->a+b;
		MathOperation subtraction=(a,b)->a-b;
		MathOperation multiplication =(int a,int b)->{return a*b;};
		MathOperation division =(int a,int b)->a/b;
		System.out.println("10+5="+tester.opearte(10,5,addition));
		System.out.println("10-5="+tester.opearte(10,5,subtraction));
		System.out.println("10*5="+tester.opearte(10,5,multiplication));
		System.out.println("10/5="+tester.opearte(10,5,division));
		
		GreetingService greetService1=message->System.out.println("hello"+message);
		GreetingService greetService2=message->System.out.println("hello"+message);
		greetService1.sayMessage("arya");
		greetService2.sayMessage("anand");
		


	}
	interface MathOperation{
		int operation (int a,int b);
		
	}
	interface GreetingService{
		void   sayMessage(String message);
		
	}
	private int opearte(int a,int b,MathOperation mathoperation) {
		return mathoperation.operation(a,b);
	}

}
