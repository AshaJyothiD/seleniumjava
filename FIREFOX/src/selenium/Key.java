package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Key {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
          WebDriver driver = new FirefoxDriver();
          driver.get("https://text-compare.com/");
         WebElement input1 = driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
          WebElement input2 = driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
          input1.sendKeys("welcome to selenium");
          Actions action = new Actions(driver);
          //CTRL +A
          action.keyDown(Keys.CONTROL);
          action.sendKeys("a");
          action.keyUp(Keys.CONTROL);
          action.perform();
          //CTRL + C
          action.keyDown(Keys.CONTROL);
          action.sendKeys("c");
          action.keyUp(Keys.CONTROL);
          action.perform();
          //TAB
          action.sendKeys(Keys.TAB);
          action.perform();
          //CTRL + V
          action.keyDown(Keys.CONTROL);
          action.sendKeys("v");
          action.perform();
          //compare
          if(input1.getAttribute("value").equals(input2.getAttribute("value"))) 
        	  System.out.println("Text copied");
          else 
        		  System.out.println("Text is not copied");
        	  
        	  }
          
	}


