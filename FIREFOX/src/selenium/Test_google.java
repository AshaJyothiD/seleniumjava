package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_google {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseurl = "https://www.google.com/";
		String actualtitle = "Google";
		String expectedtitle = "";
		driver .get(baseurl);
		//System.out.println(driver.getTitle());
		
	    expectedtitle = driver.getTitle();
	    System.out.println(expectedtitle);
	    
	    if(actualtitle.contentEquals(expectedtitle)) {
	    	System.out.println("test is passed");
	    }
	    else {
	    	System.out.println("test is failed");
	    }
	    driver.close();
	    
		

	}

}
