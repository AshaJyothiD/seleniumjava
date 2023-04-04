package selenium;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Driver_sel\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.dollardays.com");
            
}
	
}
