package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestChrome {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanm\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.opera.driver", "‪C:\\Program Files\\Opera\\launcher.exe");
		
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		d.navigate().to("https://www.facebook.com/");
		
	}

}
