package selenium;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//Full page screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\asha\\homepage.png");
		//FileUtils.copyFile(src,target);
		

	}

}
