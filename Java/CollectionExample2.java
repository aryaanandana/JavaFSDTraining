package com.ust.examples;

import java.util.*;


public class CollectionExample2 {

	public static void main(String[] args) {
		
		List list=Arrays.asList("one two three four five six one three four".split(" "));
		System.out.println("List:"+list);
		
		List sublist=Arrays.asList("three four".split(" "));
		System.out.println("sublist:"+sublist);
		System.out.println("indexOfSublist:"+Collections.indexOfSubList(list, sublist));
		System.out.println("lastIndexOfSublist:"+Collections.lastIndexOfSubList(list, sublist));

		

	}

}
