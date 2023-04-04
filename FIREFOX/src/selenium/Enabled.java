package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		System.out.println("Display status" +" "+ search.isDisplayed());
		System.out.println("Enabled status" +" " + search.isEnabled());
		
		WebElement male = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.click();
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		female.click();
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


