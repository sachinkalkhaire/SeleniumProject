package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector {

	public static void main(String[] args) {
		//launch browser
				WebDriverManager.chromedriver().setup();
				
				// Create chrome browser instant.
				WebDriver driver = new ChromeDriver();
				
				//maximize window
				driver.manage().window().maximize();
			
				//open url
				driver.get("https://www.saucedemo.com/v1/");
				
				// find element by using css selector
				//tag#id
				driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
				
				//tag[attribute=values]
				driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
				
				//tag.value of class
				
				driver.findElement(By.cssSelector("input.btn_action")).click();
				
				String windowHandle=driver.getWindowHandle();
				driver.switchTo().window(windowHandle);
				
				//tag.valueOfClass[attribute=value]
				//driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpad]")).click();
	
				//tag[attribute^=substring]   starting index
				//tag[attribute$=substring]   ending index
				//tag[attribute*=substring]   contain index
				
				driver.findElement(By.cssSelector("button[class^=btn_primary]")).click();
	
	}

}
