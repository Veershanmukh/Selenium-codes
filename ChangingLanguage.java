package pack;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ChangingLanguage {

 
public static void main(String[] args) {

	
FirefoxProfile fireFoxProfile = new FirefoxProfile();

	fireFoxProfile.setPreference("intl.accept_languages", "te");

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shanm\\Downloads\\selinium jar\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver(fireFoxProfile);

	driver.get("https://www.facebook.com/");

	

}

}