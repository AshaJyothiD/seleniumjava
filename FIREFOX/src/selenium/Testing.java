package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseurl = "https://www.facebook.com/";
		String expectedtitle = "Facebook - log in or sign up";
		//driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
				String actualtitle = "";
				driver.get(baseurl);
				
				actualtitle = driver.getTitle();
				System.out.println(actualtitle);
				
				if(actualtitle.contentEquals(expectedtitle)) {
					System.out.println("test is passed");
				}
				else {
					System.out.println("test is failed");
				}
				driver.close();
	

	}

}
