package com.obsqura.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownPractice {
	WebDriver driver;
	WebElement drop;
	Select obj;
	
	@BeforeTest
	
	
	public void dropDownTest()
	{
		
		/*driver=new ChromeDriver();
		
	     driver.get("http://www.uitestpractice.com/Students/Form");	
	     drop=driver.findElement(By.xpath("//select[@id='sel1']"));
	     obj=new Select(drop);
	     
	     System.out.println("Before test");*/
		
		driver=new ChromeDriver();
		
	     driver.get("C:/Users/ammu0/Desktop/Example.html");	
	     drop=driver.findElement(By.xpath("//select[@id='101']"));
	     obj=new Select(drop);
	     
	     System.out.println("Before test");
		
	}
	
	@Test(priority=0,enabled=true)
	public void dropDownIndex()
	{
		
		/*obj.selectByIndex(4);
		
		System.out.println("TEST 1");*/
		
		if(obj.isMultiple())
		{
		
			obj.selectByIndex(0);
			obj.selectByIndex(1);
			obj.selectByIndex(2);
			obj.selectByIndex(3);
					
			
		}
		
	}
	
	@Test(priority=1 ,enabled=true)  //if we don't want to execute any test change enabled=false  that will not execute
	
	public void dropDownText()
	{
		
		
	obj.selectByVisibleText("Denmark");
		
		System.out.println("TEST 2");
		if(obj.isMultiple())
		{
		obj.deselectAll();
		}
	}

	
	
	
	
	
	
	

}
