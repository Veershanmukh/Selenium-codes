package pack;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class CheckboxChecked {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanm\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.gmail.com");

		driver.findElement(By.id("Email")).sendKeys("veer.4669@gmail.com");

		driver.findElement(By.id("next")).click();

		// steps to find checkbox checked

		boolean ischecked;

		ischecked = driver.findElement(By.id("PersistentCookie")).isSelected();

		System.out.println(" CheckBox checked? : "+ischecked);

		driver.close();

	}



}