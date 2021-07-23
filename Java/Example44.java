package com.ust.examples;


class CarNew{
	String carname;
	String cartype;
	
	//assign value using constructor
	
	public CarNew (String  name ,String type) {
		this.carname=name;
		this.cartype=type;
		
	}
	//private method
	private String getCarName() {
		return this.carname;
	}
	class Engine{
		String enginetype;
		void setEngine() {
			if(CarNew.this.getCarName().equals("nwd")) {
				if(CarNew.this.getCarName().equals("crysler")) {
					
					this.enginetype="smaller";
					
				
			}
			
			}
			
				
				else
				{
					
					this.enginetype="bigger";
				}
			
			
			{
				this.enginetype="bigger";
			}
				
			}
		String getEngineType() {
			return this.enginetype;
		}
	}
}

public class Example44 {

	public static void main(String[] args) {
	CarNew car1=new CarNew("honda","bmw");
	CarNew.Engine engine=car1.new Engine();
	engine.setEngine();
	System.out.println("engine type for bmw="+engine.getEngineType());
	
	CarNew car2=new CarNew("honda","bmw");
	CarNew.Engine engine1=car2.new Engine();
	engine1.setEngine();
	System.out.println("engine type for bmw="+engine1.getEngineType());
	
	
	

	}

}
