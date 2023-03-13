package com.obsqura.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeAnnotations {
	
	@Test
	public void testing()
	{
	System.out.println("TEST ME");	
		
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		
	System.out.println("BEFORE SUITE");	
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		System.out.println("BEFORE METHOD");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BEFORE TEST");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("BEFORE CLASS");
	}
	
	@AfterClass
	public void afterClass()
	{
		
		System.out.println("AFTER CLASS");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("AFTER METHOD");
	}
	
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("AFTER TEST");
	}
	
	@AfterSuite
	public void afterSuit()
	{
		
		System.out.println("AFTER SUITE");
	}
	
	
	
	
	
	
	
	
	

}
