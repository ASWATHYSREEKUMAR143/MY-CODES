package com.obsqura.Training.Inheritance;

public class Salary extends CalculateHraPf{
	
	public  void totalSalary()
	{
		
	int total=	basic+hr-pf-deduction+bonous;
	
	System.out.println("Total salary :"+total);
	
		
		
	}
	
	


	public static void main(String[] args) {
		
		
		Salary s=new Salary();
		s.enterDetails();
		s.display();
		int h=s.hrCalculation();
		int p=s.pfCalculation();
		System.out.println("hr :"+h);
		System.out.println("pf :"+p);
		s.totalSalary();

	}

}
