package com.obsqura.Training.Inheritance;

public class EmployeeCl extends Member{
	
	String specialization;
	
	public EmployeeCl(String name,int age,String phonenumbr,String address,int salary,String specialization)
	{
		
	super(name,age,phonenumbr,address,salary);
	this.specialization=specialization;
		
	}
	
	public void printSalary()
	{
		
	super.printSalary();
	
	System.out.println("SPECIALIZATION : "+specialization);
		
		
		
	}
	
	public static void main(String args[])
	{
		
		ManagerCl m=new ManagerCl("VINAY",35,"985437723","GIRINAGAR,5642,ALAPPUZHA",45000,"FINANCE");
		m.printSalary();
		EmployeeCl e=new EmployeeCl("AJAY",32,"778432098","ASHOKNAGAR,8932,CHENNAI",30000,"ACCOUNTANT");
		e.printSalary();
		
	}
}
