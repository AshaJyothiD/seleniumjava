package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inner {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		//outer frame
		
		WebElement outerframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerframe);
		//inner second frame
		WebElement secondf = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(secondf);
		//inner frame
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("welcome");
		
		
		

	}

}
