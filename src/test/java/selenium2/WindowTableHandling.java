package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTableHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//find number of row
		List<WebElement>rowList=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("total number of rows:" +rowList.size());
		
		//find number of column
		List<WebElement>columnList=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("total number of column:" +columnList.size());
		
		for(int r=2;r<=rowList.size();r++)
		{
			for(int c=1;c<=columnList.size();c++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(data);
			}
		}
		
		
		
		
		
		
		
		
	}

}
