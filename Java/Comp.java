package com.ust.examples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Sund{
	int id;
	String name;
	int age;
	Sund (int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
}

class Namecomparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Sund s1=(Sund)obj1;
		Sund s2=(Sund)obj2;
		return s1.name.compareToIgnoreCase(s2.name);
		
	}
	
}

public class Comp {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		arr.add(new Sund(1,"arya",24));
		arr.add(new Sund(2,"rya",22));
		arr.add(new Sund(3,"mmf",99));
		
		System.out.println("sorting by names");
		Collections.sort(arr,new Namecomparator());
		Iterator itr=arr.iterator();
		while(itr.hasNext()) {
			Sund st=(Sund)itr.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
			
		}
		
		
		
		
		
	}

}
