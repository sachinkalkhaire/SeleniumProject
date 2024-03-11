package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		List<WebElement>linkelement= driver.findElements(By.tagName("a"));
		
		System.out.println("total number of link:" +linkelement.size());
		
		for(WebElement el:linkelement)
		{
			System.out.println(el.getText());
		}
 driver.close();
	}

}
