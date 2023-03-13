package com.obsqura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("C:/Users/ammu0/Desktop/Example.html");
		//WebElement textbox=driver.findElement(By.id("001"));
		//textbox.sendKeys("Aswathy");
		
		
		//WebElement radio1=driver.findElement(By.id("002"));
		
		//radio1.click();
		
//WebElement radio2=driver.findElement(By.id("003"));
		
//		radio2.click();
//WebElement checkbx=driver.findElement(By.id("004"));
		
	//	checkbx.click();
//WebElement button=driver.findElement(By.id("005"));
		
	//	button.click();
		
	/*WebDriver driver=new ChromeDriver();
		
		driver.get("C:/Users/ammu0/Desktop/Example.html");
		WebElement textbox=driver.findElement(By.name("A"));
		textbox.sendKeys("Aswathy");
		
		
		WebElement radio1=driver.findElement(By.name("B"));
		
		radio1.click();
		
WebElement radio2=driver.findElement(By.name("C"));
		
		radio2.click();
WebElement checkbx=driver.findElement(By.name("D"));
		
		checkbx.click();
WebElement button=driver.findElement(By.name("E"));
		
		button.click();*/
		
WebDriver driver=new ChromeDriver();
		
		driver.get("C:/Users/ammu0/Desktop/Example.html");
		WebElement textbox=driver.findElement(By.className("C1"));
		textbox.sendKeys("Aswathy");
		
		
		WebElement radio1=driver.findElement(By.className("C2"));
		
		radio1.click();
		
WebElement radio2=driver.findElement(By.className("C3"));
		
		radio2.click();
WebElement checkbx=driver.findElement(By.className("C4"));
		
		checkbx.click();
WebElement button=driver.findElement(By.className("C5"));
		
		button.click();
		
	
		
		

	}

}
