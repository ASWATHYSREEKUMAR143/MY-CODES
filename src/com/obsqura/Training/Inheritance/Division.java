package com.obsqura.Training.Inheritance;

public class Division extends Addition {
	public void division()
	{
		
		int s=super.findSum(20,30);
		
		if(s%10==0)
		{
		System.out.println("DIVISIBLE BY 10");	
			
		}
		
		else
		{
			
		System.out.println("CAN'T DIVIDE BY 10");	
			
		}
		
	}
	

	public static void main(String[] args) {
		
Division d=new Division();
		
		d.division();
		

	}

}
