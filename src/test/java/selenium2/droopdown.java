package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class droopdown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
	WebElement el=driver.findElement(By.id("input-country"));
		Select drop = new Select(el);
			
	//	drop.selectByVisibleText("Angola");
	//	drop.deselectByVisibleText("Angola");
		
	//	drop.selectByValue("99");
		
		drop.selectByIndex(22);
		
		if(drop.isMultiple()==true)
		{
		 System.out.println("droopdown is multiple");
	}
		else
		{ 
			System.out.println("droopdown is not multiple");
		}


	List<WebElement>dropdownlist= drop.getOptions();
	System.out.println("total number of country:" +dropdownlist.size());
	for(WebElement list:dropdownlist)
	{
		System.out.println("droopdown list:" + list.getText());
				
				

	}
	driver.close();
	}
	}
