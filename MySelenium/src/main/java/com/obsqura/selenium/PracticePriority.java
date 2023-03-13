package com.obsqura.selenium;

import org.testng.annotations.Test;

public class PracticePriority {

	/*&@Test
	public void aTest()
	{
		
		System.out.println("TEST A");
	}
	
	@Test                                             //EXECUTE ALAPHABETICALY
	public void cTest()
	{
		
		System.out.println("Test c");
	}
	
	
	@Test
	public void bTest()
	{
		
		System.out.println("TEST B");
	} */
	
	@Test(priority=2)
	public void aTest()
	{
		System.out.println("TEST A");
	}
	
	@Test(priority=0)
	public void bTest()
	{
		System.out.println("TEST B");       //GIVING PRIORITY AS PARAMETER,EXECUTES AS PER THE PRIORITY
	}
	
	@Test(priority=1)
	public void dTest()
	{
		System.out.println("TEST D");
	}
	@Test(priority=1)
	public void cTest()
	{
		System.out.println("TEST C");
	}

	
	
	
}
