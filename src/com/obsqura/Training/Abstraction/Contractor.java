package com.obsqura.Training.Abstraction;

public class Contractor extends Employee{
	
	int workinghr;
	
	public Contractor(String name,int paymentperhr,int workinghr)
	{
		super(name,paymentperhr);
		this.workinghr=workinghr;
		
	}
	
	public void calculateSalary()
	{
		
	int salary=paymentperhr*workinghr;
	
	System.out.println(name+"  :    Rs "+salary);
		
		
	}
	
	
	
	
	
	

}
