package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class countReadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		List<WebElement>readiobuttonlist=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total number of readio button:"+readiobuttonlist.size());
		
	WebElement radiobtn1=driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rblUamOtp_0']"));
	System.out.println("select cmd before click on button:"+radiobtn1.isSelected());
	radiobtn1.click();
	System.out.println("select cmd after click on button:"+radiobtn1.isSelected());
	System.out.println("isDisplyed"+radiobtn1.isDisplayed());
	
	System.out.println("isEnabled"+radiobtn1.isEnabled());
		driver.close();
		
	}

}
