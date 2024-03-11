package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITtool {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Actions ac= new Actions(driver);
		WebElement el= driver.findElement(By.id("file-upload"));
		ac.moveToElement(el).click().perform();
		try {
		Runtime.getRuntime().exec("C:\\Users\\Shree\\Desktop\\autoIT\\FileUpload.exe" + " "+ "C:\\Users\\Shree\\Desktop\\Asvini\\vpasc_supe.txt");
		}
		catch(Exception e)

		{
			System.out.print(e);
		}
		
	}

}
