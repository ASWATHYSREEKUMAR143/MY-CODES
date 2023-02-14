package com.obsqura.Training.Inheritance;

public class Member {
	
	String name,address;
	int age,salary;
	String phonenumbr;
	
	
	public Member(String name,int age, String phonenumbr,String address,int salary)
	{
	this.name=name;
	this.age=age;
	this.phonenumbr=phonenumbr;
	this.address=address;
	this.salary=salary;
		
		
	}
	
	public void printSalary()
	{
	System.out.println("NAME :"+name);
	System.out.println("AGE :"+age);
	System.out.println("PHONE NUMBER :"+phonenumbr);
	System.out.println("ADDRESS :"+address);
	System.out.println("SALARY :"+salary);
	
	
		
		
	}
	
	

}
