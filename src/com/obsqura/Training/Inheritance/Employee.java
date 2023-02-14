package com.obsqura.Training.Inheritance;

public class Employee {
	
	int da,hra,basic,salary,bonous;
	
	
	public Employee(int basic,int hra,int da)
	{
		this.basic=basic;
		this.hra=hra;
		this.da=da;
			
	}
	
	public int calculateSalary()
	{
	int salary=basic+hra+da;
	return salary;
	
	}
	
	public int calculateBonous()
	{
		
		int bonous=basic*10/100;
		return bonous;
		
		
		
		
	}

	
}
