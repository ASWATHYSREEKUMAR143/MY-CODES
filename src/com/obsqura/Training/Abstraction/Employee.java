package com.obsqura.Training.Abstraction;

public abstract class Employee {
	int paymentperhr;
	String name;
	
	public Employee(String name,int paymentperhr)
	{
	this.name=name;
	this.paymentperhr=paymentperhr;
		
		
	}
	
	public abstract void calculateSalary();
	
	

}
