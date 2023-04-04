package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Calculator {
       public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		 driver = new FirefoxDriver();
		launch();
	}
	public static void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border:5px solid red;background:yellow');",element);
	}
	
		
		
		public static void launch() {
		driver.get("https://www.dollardays.com/registration.aspx");
	     highlight(driver.findElement(By.xpath("//h1[text()='Create Your Free Account ']")));
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		}

}
