package handleMultipleWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Windows {
	@Test
	public void multiplewidowHandling() throws InterruptedException

	 {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\shanm\\Downloads\\selinium jar\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		
		d.manage().window().maximize();
		
		d.get("https://accounts.google.com/SignUp?hl=en");
		
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String Parent_window=d.getWindowHandle();
		
		System.out.println("Before Switching"+d.getTitle());
		
		d.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		
		Set<String> s1=d.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while (i1.hasNext())
		{
			String Child_window=i1.next();
			
			if(!Parent_window.equalsIgnoreCase(Child_window))
			{
				d.switchTo().window(Child_window);
				
				Thread.sleep(5000);
				
				System.out.println("After Switching"+d.getTitle());
				
				d.close();
			}
		}
		d.switchTo().window(Parent_window);
		
		System.out.println("Back to parent window"+d.getTitle());
	}
	


	}


