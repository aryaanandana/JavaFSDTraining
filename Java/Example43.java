package com.ust.examples;


class CPU{
	double price;
	
	//NESTED CLASS
	
	class processor{
		double cores;
		String manufacturer;
		
		double getCatch() {
			return 4.53;
		}
	}
	//nested protected class
	
	protected class RAM{
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 2.35;
			
		}
	}
}



public class Example43 {
	
		public static void main(String[] args) {
	
		CPU  cpu=new CPU();
		CPU.processor  processor = cpu.new processor();
		
		CPU.RAM ram =cpu.new RAM();
		System.out.println("processor cach="+ processor.getCatch());
		System.out.println("ram clock speed="+ram.getClockSpeed());
		
		
	}

}
