package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//WebElement element = (WebElement) jsExecutor.executeScript("return document.getElementById('email')");
			//element.sendKeys("id");
		//jsExecutor.executeScript("document.getElementById('email').value='asha';");
		//jsExecutor.executeScript("document.getElementById('email').style.background='yellow';");
		//jsExecutor.executeScript("document.getElementById('email').style.border='2px red solid';");
		//jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:2px red solid;background:yellow');");	
		//jsExecutor.executeScript("document.getElementById('ty_footer').scrollIntoView();");
		     WebElement element = driver.findElement(By.id("email"));
		     jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px red solid;background:yellow');", element);
		     
	}

}
