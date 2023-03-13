package com.obsqura.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) {
		
		/* WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		List<WebElement> checkboxes=driver.findElements(By.className("check-box-list"));
		
		for(WebElement temp:checkboxes)
		{
		temp.click(); 	
			
		} */
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:/Users/ammu0/Desktop/Example.html");
		
		List<WebElement> textboxes=driver.findElements(By.xpath("//input[@id='001']"));
		
		for(WebElement temp:textboxes)
		{
			
		temp.sendKeys("ASWATHY SREEKUMAR");	
		}
		
		
		
		
		
		
		
		

	}

}
