package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertHandling {

	public static void main(String[] args) {
		//Simple alert
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		driver.switchTo().alert().accept();
		                                   */
		
		//Confirmation alert
		/*
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		*/
		
		
		//Prompt alert
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
		driver.switchTo().alert().accept();
		driver.close();
		

	}

}
