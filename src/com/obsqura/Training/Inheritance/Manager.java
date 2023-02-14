package com.obsqura.Training.Inheritance;

public class Manager extends Employee{
	
	public Manager(int basic,int hra,int da)
	{
		
		super(basic,hra,da);
		
	}


	
	public int calculateSalary()
	{
	
		
	int x=super.calculateSalary();
		
		return x;
		
	
		
	}
	
	public int  calculateBonous()
	{
		int y=super.calculateBonous();
		return y;
	
		
		
	}
	

}
