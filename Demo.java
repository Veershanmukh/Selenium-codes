package pack.0;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void DemoBrokenLink() throws IOException
	{
		
	//	int workingLinks =0;
		//int nonWorkingLinks =0;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shanm\\Downloads\\selinium jar\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
	/*	List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement e : listOfLinks)
		{
		
			URL u = new URL(e.getAttribute("href"));
			
		HttpURLConnection urlconnection = (HttpURLConnection)u.openConnection();
		urlconnection.connect();
		 
		if(urlconnection.getResponseCode()==200)
		{
			workingLinks++;
		}
		else
		{
			nonWorkingLinks++; 
		}
		urlconnection.disconnect();
		}
		
		System.out.println("Total Number of Links: "+listOfLinks.size());
		System.out.println("No of working links: "+workingLinks);
		System.out.println("No of non working Links: "+nonWorkingLinks);*/
		driver.close();
		
		
		
		
	}
	
	}


