package selenium2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/b/ref=ohlu_bstof_best/?_encoding=UTF8&ie=UTF8&node=41789923031&pd_rd_w=tq7Dm&content-id=amzn1.sym.024c613a-4773-4e33-b678-76ecbc0597a3&pf_rd_p=024c613a-4773-4e33-b678-76ecbc0597a3&pf_rd_r=ZQHR0K6ZJPSRFNXF8WV4&pd_rd_wg=D3JFC&pd_rd_r=f33822e4-59d2-4dc0-b9b3-1c12f650a1af");
		
		//capture total cookies
	
		Set <Cookie> cookielist=driver.manage().getCookies();
		System.out.println(cookielist);
		
		for(Cookie ck:cookielist)
		{
			System.out.println(ck.getName()+""+ ck.getValue());
		}
		//driver.manage().getCookieNamed(arg0); return cookie by name
		//driver.manage().addCookie(arg0);      add new cookie
		//driver.manage().deleteCookie(arg0);   delete spec. cookie
		//driver.manage().deleteCookieNamed(arg0);
		//driver.manage().deleteAllCookies();    delete all cookie
		
		
	}

}
