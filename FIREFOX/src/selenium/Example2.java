package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement drv1 = driver.findElement(By.name("q"));
		drv1.sendKeys("selenium");
		drv1.submit();
		
		//System.out.println("The title is:" + driver.getTitle());
		//System.out.println("Page source is:" + driver.getPageSource());
		//System.out.println("Url is:" + driver.getCurrentUrl());
		System.out.println("window handle:" + driver.getWindowHandles());
		driver.quit();
		

	}

}
