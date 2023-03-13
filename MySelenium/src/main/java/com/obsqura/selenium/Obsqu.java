package com.obsqura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsqu {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("HELLO");
		WebElement button1=driver.findElement(By.id("button-one"));
		button1.click();
		WebElement field1=driver.findElement(By.id("value-a"));
		field1.sendKeys("10");
		WebElement field2=driver.findElement(By.id("value-b"));
		field2.sendKeys("20");
		WebElement button=driver.findElement(By.id("button-two"));
		button.click();
		
		
		
		
		
		

	}

}
