package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         
         String baseurl = "https://www.facebook.com/";
        // String actualtitle = "Facebook - log in or sign up";
         String attributename = "";
         driver.get(baseurl);
           attributename = driver.findElement(By.id("email")).getAttribute("name");
          System.out.println(attributename);
          driver.close();
	}

}
