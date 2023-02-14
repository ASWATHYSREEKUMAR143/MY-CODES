package com.obsequra.Training.Interface;

public class Hdfc implements RBI {
	
	public void recurringDeposit(double amnt,double period)
	{
	
		double a=amnt*intrst;
		double tot=a*period;
		System.out.println("TOTAL AMOUNT WITH "+intrst+"% INTREST RATE FOR "+period+" MONTHS"+ "is : "+tot);
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hdfc h=new Hdfc();
		h.recurringDeposit(50000, 36);
		

	}

}
