package com.ust.examples;

public class Example26 {
	private int accountno;
	private String accountname;
	private float accountbalance;
	
	private void printBankdetails() {
		System.out.println(accountno+"\n"+accountname+"\n"+accountbalance);
	}
	void insertbankdata(int x,String y,float z) {
		accountno=x;
		accountname=y;
		accountbalance=z;
		
		
	}
	
		
	}
	

class  detail{

	public static void main(String[] args) {
		
		
		Example26 p1=new Example26();
		p1.insertbankdata(12, "arya", 100000f);
		
	}

}
