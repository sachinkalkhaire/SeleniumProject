package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeAndFRAME {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame(0);
	System.out.println(driver.findElement(By.id("nseindex")).getText());
	
/*	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	System.out.println(driver.findElement(By.id("img_anch_CN-Vs9TTp4QDFcFVnQkd0D4MIw")).getText());
		*/
		
		
	}

}
