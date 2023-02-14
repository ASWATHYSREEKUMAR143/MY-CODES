package com.obsqura.Training.Encapsulation;

public class EmployeeCl {
	String empname;
	int empid;
	CarCl c;
	BikeCl b;
	
	public EmployeeCl(String empname,int empid,CarCl c,BikeCl b)
	{
		
	this.empname=empname;
	this.empid=empid;
	this.c=c;
	this.b=b;	
	}
	
	public void display()
	{
	System.out.println("NAME : "+empname);
	System.out.println("ID :"+empid);
	System.out.println("CAR : "+c.name);
	System.out.println("COLOR: "+c.clr);
	System.out.println("REG.NMBR : "+c.regnmbr);
	System.out.println("BIKE : "+b.bkname);
	System.out.println("REG.NMBR : "+b.bkrgnmb);	
	}
	
	public static void main(String[] args) {
		
		CarCl crc=new CarCl("HONDA AMAZE","RED",456732);
		BikeCl bkl=new BikeCl("PULSAR 135",87562);
		EmployeeCl e=new EmployeeCl("KIRAN KUMAR",1045328759,crc,bkl);
		
		e.display();
	}
}
