package selenium2;


//import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Encoding_EncryptionData {

	public static void main(String[] args) {
/*		
				
String password= "admin123";

byte[] encodedPwrd=Base64.encodeBase64(password.getBytes());
System.out.println(new String(encodedPwrd));

//Decode password= YWRtaW4xMjM=;  he find karnyasathi ha code vaparla ..pudhil code actual ahe
		 */

	
      
	//byte[] decodePwrd=	Base64.decodeBase64("YWRtaW4xMjM=");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("decodePwrd");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

}
