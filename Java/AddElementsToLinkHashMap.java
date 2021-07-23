package com.ust.examples;

import java.util.*;


public class AddElementsToLinkHashMap {

	public static void main(String[] args) {
		//intializing of a linked hashmap
		//using generics
		LinkedHashMap<Integer,String> hml =new  LinkedHashMap<Integer,String> ();
		//add maping using
		//put to method
		hml.put(3, "arya");
		hml.put(4, "ananadan");
		hml.put(1, "allu");
		
		//print mapping to the console
		
		System.out.println("mapping of linkedhashmap:"+hml);
		

	}

}
