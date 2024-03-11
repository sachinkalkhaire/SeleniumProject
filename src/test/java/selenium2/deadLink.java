package selenium2;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deadLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
	List<WebElement> list= driver.findElements(By.tagName("a"));
	System.out.println("Total Number of link:" +list.size());
	
	int resCode=200;   //valid code
	int brokenLinkCnt=0;
	for(WebElement el:list)
	{
		String url=el.getAttribute("href");
		try
		{
			URL urlLink= new URL(url);
			HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();
			huc.setRequestMethod("HEAD");
			huc.connect();
			
			resCode=huc.getResponseCode();
			if(resCode>=400)
			{
				System.out.println("broken link:"+ url);
				brokenLinkCnt++;
			}
		}
		catch(Exception e)
		{
			
		}
	}
	System.out.println("total brokenLink:"+brokenLinkCnt);

	}

}
