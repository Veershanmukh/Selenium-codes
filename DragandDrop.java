package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shanm\\Downloads\\selinium jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		 Actions action = new Actions(driver);
		 action.dragAndDrop(driver.findElement(By.id("dragdiv")), driver.findElement(By.id("dropdiv")));
		 action.perform();

	}

}
