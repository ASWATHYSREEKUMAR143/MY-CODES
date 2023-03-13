package com.obsqura.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); //to open browser
		//WebDriver driver=new EdgeDriver();
		
		//GET COMMANDS
		
		driver.get("https://www.google.co.in/");
		//driver.get("https://www.amazon.in/");  //to open any web application
		
		System.out.println(driver.getTitle()); //to get the title of the application
		System.out.println(driver.getCurrentUrl()); //to get current url for verification
		//System.out.println(driver.getPageSource()); //source code of url
		
		//NAVIGATION COMMANDS
		
		driver.navigate().to("https://www.amazon.in/"); //
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//BROWSER COMMANDS
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
