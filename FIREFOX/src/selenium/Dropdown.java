package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	Select drv = new Select(driver.findElement(By.name("country")));
	//drv.selectByVisibleText("ARUBA");
	//drv.deselectByValue("ALGERIA");
	//drv.selectByIndex(6);
	drv.isMultiple(); 
		
		System.out.println();
	

	}

}
