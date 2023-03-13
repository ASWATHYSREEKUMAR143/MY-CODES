package com.obsqura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		
		/*WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
	//WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf' and @name='q']")); //XPATH AND FUNCTION
		//WebElement search=driver.findElement(By.xpath("//input[@class='gLFy' and @name='q']")); //XPATH FAILED AND FUNCTION ARISE org.openqa.selenium.NoSuchElementException
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFy' or @name='q']")); //XPATH OR FUNCTION
		
		search.sendKeys("BOLLYWOOD SONGS");
		*/
		
WebDriver driver=new ChromeDriver();
		
		/*driver.get("C:/Users/ammu0/Desktop/Example.html");
		WebElement namefield=driver.findElement(By.xpath("//input[@id='001'][2]")); //ELEMENT LOCATE BY INDEX
		namefield.sendKeys("ASWATHY SREEKUMAR");
		*/

driver.get("https://www.saucedemo.com/");



		
		
		
		
		
		

	}

}
