package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Hrm {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		WebElement noOfEmpsEle =driver.findElement(By.xpath("//*[@id=\"Form_getForm_NoOfEmployees\"]"));
		selectOptionFromDropDown(noOfEmpsEle,"16 - 20\r\n"
				+ "	");
		WebElement country = driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]"));
		selectOptionFromDropDown(country,"Angola\r\n"
				+ "	");
	}
	
		public static void selectOptionFromDropDown(WebElement ele,String value) {
			Select drp = new Select(ele);
			List<WebElement> alloptions = drp.getOptions();
			for(WebElement option:alloptions) {
				if(option.getText().equals(value)) {
					option.click();
					break;
				}
			}
		}

	

	
	
		
	}


