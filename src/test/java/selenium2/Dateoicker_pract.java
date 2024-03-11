package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dateoicker_pract {

	public static void main(String[] args) {
		
		String expectedDay= "14";
		String expectedMonth= "June";
		String expectedYear= "2025";
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			String actualMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String actualYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(actualMonth.equals(expectedMonth) && actualYear.equals(expectedYear))
			{
				List <WebElement> dayslist =driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement e:dayslist)
				{
					String actualDay=e.getText();
					if(actualDay.equals(expectedDay))
					{
						e.click();
						break;
					}
					
				}
			     break;
				
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
			
		}

	}

}
