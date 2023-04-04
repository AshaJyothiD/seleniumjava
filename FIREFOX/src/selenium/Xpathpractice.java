package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathpractice {
    public static WebDriver driver;
    
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver" ,"C:\\Driver_sel\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 chapter();
	   }
	
	public static void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow');",element);
	
	  }
	public static void chapter() {
		
	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	//highlight(driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")));
	//driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
	highlight(driver.findElement(By.xpath("//td[text()='Helen Bennett']/parent::tr")));
	}
	
	
}
	
