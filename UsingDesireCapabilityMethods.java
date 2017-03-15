package Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UsingDesireCapabilityMethods {

public static void main(String[] args) {

	

	DesiredCapabilities desirecapabilities = DesiredCapabilities.internetExplorer();

	 

	desirecapabilities.setBrowserName("IE");

	desirecapabilities.getBrowserName();

	String version =desirecapabilities.getVersion();

	System.out.println("version of the IE using: "+version);

	

	System.setProperty("webdriver.ie.driver","C:\\Users\\shanm\\Downloads\\selinium jar\\IEDriverServer.exe");

	

	WebDriver driver = new InternetExplorerDriver(desirecapabilities);

	driver.get("http://automationpractice.com/index.php");

	

	driver.close();

	

}



}