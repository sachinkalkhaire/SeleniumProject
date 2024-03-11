package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFormFillInSingleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		Actions ac=new Actions(driver);
	 ac.moveToElement(driver.findElement(By.id("user-name")))
		.click()
		.sendKeys("standard_user",Keys.TAB)
		.sendKeys("secret_sauce",Keys.ENTER)
		.perform();
		
		
		
	}

	

}
