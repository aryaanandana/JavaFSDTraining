package com.ust.examples;

import java.util.Enumeration;
import java.util.Hashtable;


public class Enumerations {

	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		ht.put("1","one");
		ht.put("2", "two");
		ht.put("3", "four");
		Enumeration  e= ht.keys();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
