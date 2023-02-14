package com.obsqura.Training.Encapsulation;

public class Employee {
	
	String empname;
	int empid;
	Car c;
	
	public Employee(String empname,int empid,Car c)
	{
	this.empname=empname;
	this.empid=empid;
	this.c=c;
		
	}
	public void display()
	{
		
	System.out.println(empname+" ,"+empid);
	System.out.println(c.name+" ,"+c.clr+" ,"+c.regnmbr);
		
		
	}
	
	

	public static void main(String[] args) {
		Car cr=new Car("HONDA CITY","WHITE",356782);
	    Employee e=new Employee("ASWATHY SREEKUMAR",1056783421,cr);
	    
	    e.display();

	}

}
