package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navi {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
