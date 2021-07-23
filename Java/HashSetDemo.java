package com.ust.examples;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//creating Hashset and adding elements
		HashSet<String>hs =new HashSet<String>();
		hs.add("geeks");
		hs.add("for");
		hs.add("Geek");
		hs.add("is");
		hs.add("very helpful");
		//traversing element
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
