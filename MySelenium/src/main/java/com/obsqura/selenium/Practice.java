package com.obsqura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practice {
	
	@Test
	public  void dropdown() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
	     driver.get("http://www.uitestpractice.com/Students/Form");	
	     
	     WebElement firstname=driver.findElement(By.xpath("//input[@id='firstname']"));
	     firstname.sendKeys("ASWATHY");
	     WebElement lastname=driver.findElement(By.xpath("//input[@id='lastname']"));
	     lastname.sendKeys("SREEKUMAR");
	     
	     WebElement marriedbutton=driver.findElement(By.xpath("//input[@name='optradio'][1]"));
	     marriedbutton.click();
	     Thread.sleep(5000);
	    /* WebElement singlebutton=driver.findElement(By.xpath("//input[@name='optradio'][2]"));
	     singlebutton.click();
	     Thread.sleep(5000);
	     WebElement divorsebutton=driver.findElement(By.xpath("//input[@name='optradio'][3]"));
	     divorsebutton.click();
	     Thread.sleep(5000); */
	     WebElement dance=driver.findElement(By.xpath("//input[@value='dance']"));
	     dance.click();
	     Thread.sleep(5000);
	     WebElement reading=driver.findElement(By.xpath("//input[@value='read']"));
	     reading.click();
	     Thread.sleep(5000);
	     WebElement cricket=driver.findElement(By.xpath("//input[@value='cricket']"));
	     cricket.click();
	     Thread.sleep(5000);
	     
	     WebElement country=driver.findElement(By.xpath("//select[@id='sel1']"));
	     Select list=new Select(country);
	     list.selectByVisibleText("India");
	     WebElement dob=driver.findElement(By.xpath("//input[@id='datepicker']"));
	     dob.sendKeys("02/03/1994");
	     Thread.sleep(5000);
	     WebElement phnnmbr=driver.findElement(By.xpath("//input[@id='phonenumber']"));
	     phnnmbr.sendKeys("1234567891");
	     Thread.sleep(5000);
	     WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	     username.sendKeys("aswathy143");
	     Thread.sleep(5000);
	     WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	     email.sendKeys("ammu.0478@gmail.com");
	     Thread.sleep(5000);
	     WebElement pwd=driver.findElement(By.xpath("//input[@id='pwd']"));
	     pwd.sendKeys("password");
	     Thread.sleep(5000);
	     WebElement submitbutton=driver.findElement(By.xpath("//button[@class='btn btn-default ']"));
	     submitbutton.submit();
	     Thread.sleep(5000);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    
	     
	     
	     
	     
	     
		
		
	}
	
	
	
	

}
