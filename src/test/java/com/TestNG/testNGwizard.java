package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNGwizard {
	
	@Test
	public void test1(){

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Google";
		
		Assert.assertEquals(actualTitle,expectedTitle);
	
		
		
	}
}
