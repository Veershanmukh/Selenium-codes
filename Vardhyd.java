package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Vardhyd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanm\\Downloads\\chrome\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.getWindowHandle();
		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		d.navigate().to("https://www.google.com/");
		d.findElement(By.id("lst-ib")).sendKeys("gmail");
		d.findElement(By.id("_fZl")).click();
	
		Thread.sleep(5000);
		d.findElement(By.linkText("Gmail - Google")).click();
		d.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		//d.findElement(By.cssSelector("css=a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();
		//d.findElement(By.linkText("Sign In")).click();
		//d.findElement(By.className("gmail-nav__nav-link gmail-nav__nav-link__sign-in")).click();

		d.findElement(By.id("Email")).sendKeys("veer.4669@gmail.com");
		d.findElement(By.id("next")).click();
		d.findElement(By.id("Passwd")).sendKeys("shanmukh4669");
		d.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		//d.close();
		
		

		
	}

}