package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Shot {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	//drag and drop	//driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement image2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
		WebElement trash = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(image1, trash).perform();
		action.dragAndDrop(image2, trash).perform();
		
		
		}


	}


