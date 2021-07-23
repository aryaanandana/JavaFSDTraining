package com.ust.examples;

public class GenericsExample {

	public static void main(String[] args) {
		
		//intialize  generics size
		//with ineger data
		GenericsClass<Integer> intObj=new GenericsClass<>(5);
		System.out.println("generics class return:"+intObj.getData());
		//intialize generics class
		//with string class
		
		GenericsClass<String> stringObj=new GenericsClass<>("java programming");
		System.out.println("generic class return:"+stringObj.getData());
	

	}

}
class GenericsClass<T>{
	 private T data;
	 
	 public  GenericsClass(T data) {
		 this.data=data;
		 
	 }
	

public T getData() {
	
	return this.data;

}
}
