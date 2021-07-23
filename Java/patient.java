package com.ust.examples;

class patie{
	private String name;
	private int age;
	private float salary;
	private boolean vacc;
	public boolean isVacc() {
		return vacc;
	}
	public void setVacc(boolean vacc) {
		this.vacc = vacc;
		
		if(vacc==true)
		{
			System.out.println("congrats");
		}
		else {
			System.out.println("get vacciates asap");
			
		}
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}



public class patient {

	public static void main(String[] args) {
		patie p=new patie();
		p.setVacc(false);
		System.out.println(p.isVacc());
		
		

	}

}
