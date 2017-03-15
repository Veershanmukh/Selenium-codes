package Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingChromeDriver {
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanm\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver d = new ChromeDriver();

		
		d.get("https://mail.google.com/mail/u/0/#inbox");
		
	}

}