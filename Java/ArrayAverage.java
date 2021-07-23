package com.ust.examples;

public class ArrayAverage {

	public static void main(String[] args) {
		
		double array[]= {10,15,20,25,30,35};
		
		double sum=0.0;
		
		double avg=0.0;
		
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
			
		}
		
		
		avg=sum/array.length;
		
		System.out.println("Average:"+avg);

	}

}
