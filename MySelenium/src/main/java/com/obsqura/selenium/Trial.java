package com.obsqura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Trial {
	
	@Test
	public void firstTest()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("HELO WORLD");
		WebElement button1=driver.findElement(By.id("button-one"));
		button1.click();
		WebElement messagebox=driver.findElement(By.id("message-one"));
		System.out.println(messagebox.getText());
		Assert.assertEquals(messagebox.getText(),"Your Message : HELLO WORLD");
		/*WebElement value1=driver.findElement(By.id("value-a"));
		value1.sendKeys("50");
		WebElement value2=driver.findElement(By.id("value-b"));
		value2.sendKeys("10");
		WebElement button2=driver.findElement(By.id("button-two"));
		button2.click();*/
		
		
	}
	
	@Test
	public void calculation()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement value1=driver.findElement(By.id("value-a"));
	value1.sendKeys("50");
	WebElement value2=driver.findElement(By.id("value-b"));
	value2.sendKeys("10");
	WebElement button2=driver.findElement(By.id("button-two"));
	button2.click();
	
	
	
		
		
		
	}
	
	
	

}
