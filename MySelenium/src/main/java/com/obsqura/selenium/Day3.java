package com.obsqura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:/Users/ammu0/Desktop/Example.html");
		
		//WebElement link=driver.findElement(By.linkText("Click me"));   //ELEMENT LOCATE BY LINK TEXT
		
		//WebElement link=driver.findElement(By.partialLinkText("me"));    //ELEMENT LOCATE PARTIAL LINK TEXT
		
		//WebElement link=driver.findElement(By.tagName("a"));  //ELEMENT LOCATE BY TAG NAME
		
		
		//WebElement link=driver.findElement(By.xpath("//input[@name='A']")); //By RELATIVE XPATH
		
		WebElement link=driver.findElement(By.xpath("/html/body/input[1]")); // ABSOLUTE XPATH
		
		
		link.sendKeys("ASWATHY SREEKUMAR");
		
		
		
		
		

	}

}
