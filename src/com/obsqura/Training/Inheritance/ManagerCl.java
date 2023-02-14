package com.obsqura.Training.Inheritance;

public class ManagerCl extends Member {
	
	String department;
	
	public ManagerCl(String name,int age,String phonenumbr,String address,int salary,String department)
	
	{
		super(name,age,phonenumbr,address,salary);
		this.department=department;
		
	}
	
	public void printSalary()
	{
		
	super.printSalary();
	
	System.out.println("DEPARTMENT : "+department);
		
		
		
	}
	
	
	

}
