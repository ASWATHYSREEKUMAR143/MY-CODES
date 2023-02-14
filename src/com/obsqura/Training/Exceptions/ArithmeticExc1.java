package com.obsqura.Training.Exceptions;



public class ArithmeticExc1 {
	
	public  void checkExc() 
	{
int a=50;
int b=0;
if(b==0)
{
throw new ArithmeticException ("TRIED TO DIVIDE BY ZERO");
}
else
{
int c=a/b;
System.out.println(c);
}
		
		
	}
	
	

	public static void main(String[] args) throws ArithmeticException {
		
		
		ArithmeticExc1 e1=new ArithmeticExc1();
		try
		{
		e1.checkExc();
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);	
			
		}
		

	}

}
