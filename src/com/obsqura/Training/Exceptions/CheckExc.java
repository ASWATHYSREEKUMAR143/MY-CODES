package com.obsqura.Training.Exceptions;

public class CheckExc {

	public void ageChecker(int age) throws InvalidAgeException
	{
		
	if(age<18)
	{
	throw new InvalidAgeException("NOT ELIGIBLE");	
		
	}
	else
	{
		
		System.out.println("Eligible");
	}
		
		
	}

	public static void main(String[] args) {
		CheckExc c=new CheckExc();
		
		try
		{
		c.ageChecker(13);
		}
		
		catch(InvalidAgeException e)
		{
		System.out.println(e);	
			
		}

	}

}
