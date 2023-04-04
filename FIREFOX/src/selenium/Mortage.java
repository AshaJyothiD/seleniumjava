package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mortage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.get("https://www.calculator.net/mortgage-payoff-calculator.html");
         driver.findElement(By.id("cpayoff1"));
         System.out.println("The Output of the IsSelected " + driver.findElement(By.id("cpayoff1")).isSelected());
         System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("cpayoff1")).isEnabled());
         System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("cpayoff1")).isDisplayed());

	}

}
