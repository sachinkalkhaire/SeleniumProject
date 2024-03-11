package selenium2;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerticalScroll {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.calculator.net/");
		
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//scroll vertical down by 500 pixels
		//js.executeScript("window.scrollBy(0,500)");
		
		//scroll till visibility of element
		WebElement el=driver.findElement(By.linkText("Sales Tax Calculator"));
		js.executeScript("arguments[0].scrollIntoView();",el);
		
		
		
		
		
		
		
		
	}

}
