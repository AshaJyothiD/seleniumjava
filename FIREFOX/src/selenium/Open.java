package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Open {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",  "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement element = driver.findElement(By.id("input-country"));
		Select country = new Select(element);
		//country.selectByVisibleText("India");
		//country.selectByValue("8");
		//country.selectByIndex(12);
		List<WebElement> countrylist = country.getOptions();
		for(WebElement option:countrylist) {
			if(option.getText().equals("Australia")) {
				option.click();
				break;
			}
		}
			}
		

	}


