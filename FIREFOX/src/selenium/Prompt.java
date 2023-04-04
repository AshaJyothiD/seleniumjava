package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Alert window with ok button
		/*
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		*/
		//Alert with ok or cancel button
		/*
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		*/
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"))
		.click();
		Thread.sleep(3000);
		Alert alertwindow = driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		alertwindow.sendKeys("asha");
		alertwindow.accept();
		
		
		
		

	}

}
