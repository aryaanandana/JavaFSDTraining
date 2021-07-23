package com.ust.examples;


abstract class emplo{
	private String name;
	private int emplohour;
	
	void display()
	{
		System.out.println("name is "+name+"\n"+"employee hour is"+emplohour);
	}
	public emplo() {
		
		
	}
	public emplo(String name,int emplohour) {
		this.name=name;
		this.emplohour=emplohour;
		
		
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public String getname() {
		return name;
		
	}
	public void setemplohour(int emplohour)
	{
		this.emplohour=emplohour;
	}
	public int getemplohour() {
		return emplohour;
	}
	abstract void salary(int x,int y);
}
public class Exampl32 extends emplo {
	Exampl32(){
		
	super();
}
 Exampl32(String name,int emplohour){
	 super(name,emplohour);
	 
	 
 }
 void salary(int days,int total_sal) {
	 if((total_sal/days)>500) {
		 System.out.println("goooood");
		 
	 }
	 else
	 {
		 System.out.println("not gooood");
	 }
 }
	public static void main(String[] args) {
		Exampl32 e1=new Exampl32("arya",24);
		e1.display();
		Exampl32 e2=new Exampl32();
		e2.setname("arya");
		System.out.println(e2.getname());
		e2.salary(100, 200000);
		
		
	}

}
