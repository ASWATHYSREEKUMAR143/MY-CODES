package com.obsqura.Training.Exceptions;

public class ArreyExc{
	
	public void excCheck()
	{
		
	int a[]={10,20,40,76,50};
	
	int y=a[7];
	System.out.println(y);	
	}

	public static void main(String[] args) {
		try
		{
		ArreyExc b=new ArreyExc();
		
			b.excCheck();
		}
		
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("ARRAY IS OUT OF BOUND");
			
		}

	}

}
