package com.obsqura.Training.Abstraction;

public class FullTimeEmployee extends Employee {
	
	
	public FullTimeEmployee(String name,int paymentperhr)
	{
		
		super(name,paymentperhr);
		
	}
	
	
	public void calculateSalary()
	{
	
		int sa=paymentperhr*8;
		
		System.out.println(name+"  :   Rs "+sa);
		
	}
	
	

	public static void main(String[] args) {
		
		Contractor c=new Contractor("CONTRACTOR",2000,20);
		Employee f=new FullTimeEmployee("FULL TIME EMPLOYEE",4000);
		c.calculateSalary();
		f.calculateSalary();
			

	}

}
