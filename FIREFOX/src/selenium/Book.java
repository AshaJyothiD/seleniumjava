package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Book {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		txtUserName.sendKeys("hello ");
		
		Actions action = new Actions(driver);
		   action.moveToElement(txtUserName).click()
		   
				  .keyDown(Keys.SHIFT)
				  
				  .sendKeys("")
				  
				  .keyUp(Keys.SHIFT);
				  /*
				  .doubleClick(txtUserName).contextClick().build()
		 .perform(); 
		}*/

		

	}

}
