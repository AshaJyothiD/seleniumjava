package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String tagname = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagname);
		//driver.findElement(By.id("email")).sendKeys("asha");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("asha");
		driver.close();
		//System.exit(0);

	}

}
