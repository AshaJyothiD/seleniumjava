package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.id("input")).sendKeys("asha");
		

	}

}
