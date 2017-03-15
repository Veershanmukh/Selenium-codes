package pack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssertAndVerify {

	

	

	


	
	public static void main (String[] args)
	{
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shanm\\Downloads\\selinium jar\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();

	driver.get("https://gmail.com");

	

	String heading= driver.findElement(By.id("firstHeading")).getText();

	

	Assert.assertEquals(heading, "Rothschild family");

	driver.close();

	}

	

	

}