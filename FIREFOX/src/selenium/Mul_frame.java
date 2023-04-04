package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mul_frame {

	public static void main(String[] args) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	  driver.manage().window().maximize();
	  //outer iframe
	  driver.switchTo().frame("iframeResult");
	  driver.switchTo().frame(0);
	  System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	  driver.switchTo().parentFrame();
	 String text =  driver.findElement(By.xpath("/html/body/p")).getText();
	 System.out.println("text is:" + text);
	  
	  

	}

}
