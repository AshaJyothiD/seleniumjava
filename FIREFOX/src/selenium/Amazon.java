package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.dollardays.com/");
	  //driver.findElement(By.linkText("Today's Deals")).click();
	 // List<WebElement> links = driver.findElements(By.tagName("a"));
	  //links.size();
	 // System.out.println("The no of links is:" + links.size());
	 /* for(int i=0;i<=links.size();i++) {
		  System.out.println(links.get(i).getText());
		  System.out.println(links.get(i).getAttribute("ahref"));
	  }*/
	  //for(WebElement link:links) { //for-aeach loop
		 // System.out.println(link.getText());
		  //System.out.println((link).getAttribute("href"));
	  /*
	  WebElement inputElement = driver.findElement(By.name("terms"));

	  if (inputElement.isDisplayed()) {
	      inputElement.sendKeys("input value");
	  } 
	  else {
		  System.out.println("failed" +inputElement.getText());
	  }*/

	 // driver.findElement(By.name("terms")).sendKeys("shoes");
	 // WebElement inputElement = driver.findElement(By.name("terms"));
	  //System.out.println(driver.findElement(By.cssSelector("input[data-tdi='0']")).getSize());
	  Thread.sleep(3000);
	  //System.out.println(driver.findElement(By.xpath("//input[@name='terms']")).getSize());
	 // System.out.println(driver.findElement(By.xpath("//h4[text()='Household Essentials']")).getSize());
	 // System.out.println(driver.findElement(By.cssSelector("div.search-dummy.hidden-lg.hidden-xs"));
	  //driver.findElement(By.xpath("//span[@class='search_btn']")).click();
	  driver.findElement(By.id("sm_menu_ham")).click();

	}
}
	


