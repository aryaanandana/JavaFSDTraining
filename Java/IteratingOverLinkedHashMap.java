package com.ust.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingOverLinkedHashMap {

	public static void main(String[] args) {
		
		//intializing of a linked list
		//uisng generics
		LinkedHashMap<Integer,String>  hm = new LinkedHashMap<Integer,String>();
		//insering elements
		hm.put(4, "ayaa");
		hm.put(3, "manau");

		for(Map.Entry<Integer,String> mapElement:hm.entrySet()) {
			Integer Key=mapElement.getKey();
			
			//finding value
			
			String value=mapElement.getValue();
			//print the key:value pair
			
			System.out.println(Key+":"+value);
		}
		
	}

}
