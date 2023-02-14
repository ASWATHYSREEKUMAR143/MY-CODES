package com.obsqura.Training.Inheritance;
import java.util.Scanner;

public class Details {
	
	int basic,deduction,bonous;
	String name;
	
	public  void enterDetails()
	{
	
		Scanner sc=new Scanner(System.in);
	
	System.out.print("NAME OF EMPLOYEE:");
	name=sc.nextLine();
	System.out.print("BASIC PAY FOR "+name+":");
	basic=sc.nextInt();
	System.out.print("Deduction:");
	deduction=sc.nextInt();
	System.out.print("Bonus:");
	bonous=sc.nextInt();
	}
	
	public void display()
	{
	
		System.out.println("Name:"+name);
		System.out.println("Basic pay:"+basic);
		System.out.println("Deduction:"+deduction);
		System.out.println("Bonous:"+bonous);
			
		
	}
}
