package com.ust.examples;

import java.util.*;


public class Gfg {

	public static void main(String[] args) {
		
		//creating empty priority queue
		PriorityQueue<Integer>pQueue=new  PriorityQueue<Integer>();
		//Adding item to the pqueue using add
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		
		//printing the top element of queue
		System.out.println(pQueue.peek());
		//printih the top element and remove it from the priority queue container
		System.out.println(pQueue.poll());
		
		//printing top element again
		System.out.println(pQueue.peek());	
	}

}
