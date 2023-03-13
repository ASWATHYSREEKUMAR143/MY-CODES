package com.obsqura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	
	WebElement message=driver.findElement(By.cssSelector("input[id='single-input-field']"));
	
		
		System.out.println(message.isDisplayed());   //WEBELEMENT COMMANDS
		
		
		
		System.out.println(message.isEnabled());
		System.out.println(message.isSelected());
		message.sendKeys("HELLO WORLD");
		System.out.println(message.getTagName());
		System.out.println(message.getAttribute("id"));
		System.out.println(message.getText());
		System.out.println(message.getSize());
		System.out.println(message.getCssValue("font"));
		System.out.println(message.getLocation());
		message.clear();
		message.sendKeys("HI HOW ARE YOU");
		
	

	}

}
