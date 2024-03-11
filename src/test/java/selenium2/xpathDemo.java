package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
	/*	//using single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		//using multiple attribute
		driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//switch to product page
		String windowHndale=driver.getWindowHandle();
		driver.switchTo().window(windowHndale);          */
		
		//using and
		driver.findElement(By.xpath("//input[@id='user-name'and @name='user-name']")).sendKeys("standard_user");
		
		//using or
		driver.findElement(By.xpath("//input[@id='password'or @name='password']")).sendKeys("secret_sauce");
		
		//using contain method
		driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();

				
	}

}
