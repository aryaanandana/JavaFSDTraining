package com.ust.examples;

import java.util.Hashtable;
import java.util.Enumeration;


public class HashTableExample {

	public static void main(String[] args) {
		Enumeration names;
		String Key;
		
		//creating hashtable
		Hashtable <String,String>hashtable=new  Hashtable<String,String>();
		
		//adding key and value pairs to hashtable
		hashtable.put("Key1", "arya");
		hashtable.put("Key2", "arya raj");
		hashtable.put("Key3", "akhila");
		hashtable.put("Key4", "alona");
		hashtable.put("Key5", "sarmada");
		
		names=hashtable.keys();
		while(names.hasMoreElements())
		{
			Key=(String)names.nextElement();
			System.out.println("Key:"+Key+"&Value:"+hashtable.get(Key));
		}

	}

}
