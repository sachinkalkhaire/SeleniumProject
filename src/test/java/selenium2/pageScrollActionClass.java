package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageScrollActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.calculator.net/");
		Actions ac=new Actions(driver);
	
		
		WebElement el=driver.findElement(By.xpath("//img[@alt='All Calculators']"));
		
         //ac.scrollByAmount(0, 1000).perform();
		
        ac.scrollToElement(el).perform();
        
        
	}

}
