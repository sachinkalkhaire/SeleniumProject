package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_xpath {

	public static void main(String[] args) {
		
		//launch browser
		WebDriverManager.chromedriver().setup();
		
		// Create chrome browser instant.
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
	
		//open url
		driver.get("https://www.saucedemo.com/v1/");
		// find element by using id,name,className
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		
		//move one window to other window
		String windowHndale=driver.getWindowHandle();
		driver.switchTo().window(windowHndale);
		
		//find element by using link text and partial link text
		
		//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		//driver.findElement(By.partialLinkText("Bolt T-Shirt")).click();

		//driver.findElement(By.className("inventory_item_name")).click();
		
		List <WebElement> list=driver.findElements(By.partialLinkText("Sauce"));
		System.out.println(list.size());
		
	}

}
