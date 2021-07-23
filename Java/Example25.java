package com.ust.examples;

public class Example25 {
	int a=9;
	int b=18;
	
	void m1()
	{
		a=10;
		b=20;
		
	}
	
	class test{
		static void m1(Example25[]e) {
			e[1].m1();
		}
	}
	class array{
		
	}

	public static void main(String[] args) {
		
		Example25[] ex= {new Example25(),new Example25(),new Example25()};
		test.m1(ex);
		for(int i=0;i<ex.length;i++) {
			System.out.println(ex[i].a+"\t");
			System.out.println(ex[i].b+"\n");
		}
		

	}

}
