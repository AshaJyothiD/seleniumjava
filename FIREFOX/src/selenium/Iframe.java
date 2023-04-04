package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	     driver.manage().window().maximize();
	     //first frame
	     driver.switchTo().frame("packageListFrame");//name of frame
	     driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
	     driver.switchTo().defaultContent();
	     Thread.sleep(3000);
	     //second frame
	     driver.switchTo().frame("packageFrame");
	     driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[13]/a/span")).click();
	     driver.switchTo().defaultContent();
	     Thread.sleep(3000);
	     //third frame
	     driver.switchTo().frame("classFrame");
	     driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
	     
	     
	      
		
		
	}

}
