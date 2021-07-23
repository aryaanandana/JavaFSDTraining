package com.ust.examples;

class  students
{
	int roll;
	void getData(int p)
	{
		roll=p;
		
	}
	void display()
	{
		System.out.println("Roll no is:"+roll);
		
	}
}
class test extends students{
	double p1,p2;
	void PutMarks (double x,double y)
	{
		p1=x;
		this.p2=y;
	}
	
	void showmarks()
	{
		System.out.println("test1="+p1);
		System.out.println("test2="+p2);
	}
}

interface sports{
	double weight=50.0;
	void ShowWeight();
	
}

class Results extends test implements sports{
	double total;
	public void ShowWeight()
	{
		System.out.println("weight="+weight);
		
	}
	void displayAll()
	{
		total=p1+p2+weight;
		display();
		showmarks();
		ShowWeight();
		System.out.println("the total is"+total);
	}
	
}
public class Example47 {

	public static void main(String[] args) {
		
		Results res=new Results();
		res.getData(101);
		res.PutMarks(55.5,77.8);
		res.display();
		
	}

}
