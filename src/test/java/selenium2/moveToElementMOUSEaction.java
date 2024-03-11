package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElementMOUSEaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		Actions ac = new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//li[@class='vl-flyout-nav__js-tab']//a[contains(text(),'Electronics')]"));
		
	     ac.moveToElement(button).click().build().perform();

	}

}
