package pack;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SetLanguage {

@Test
	
		public void ChangeLanguage()
		{
			FirefoxProfile fireFoxProfile = new FirefoxProfile();
			
			fireFoxProfile.setPreference("intl.accept_languages", "hi");

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shanm\\Downloads\\selinium jar\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver(fireFoxProfile);
			driver.get("https://www.facebook.com/");
		}

	}
