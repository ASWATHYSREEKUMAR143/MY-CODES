package com.obsqura.Training.Inheritance;

public class Accountant extends Employee {
	
	public Accountant(int basic,int hra,int da)
	{
		
		super(basic,hra,da);
		
	}
	

	
	public int calculateSalary()
	{
	
	int a=super.calculateSalary();
	return a;
	
	
		
	}
	
	public  int calculateBonous()
	{
		
		int b=super.calculateBonous();
		return b;
		
		
	}


	

}
