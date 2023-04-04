package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Webdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Driver_sel\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		//driver.findElement(By.cssSelector("font:contains(\"Password:\")");
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
		.sendKeys("asha");
		//driver.manage().window().maximize();
		// WebElement username = driver.findElement(By.name("userName"));
				// username.sendKeys("mercury");
       // driver.findElement(By.name("password")).sendKeys("mercury");
        //driver.findElement(By.name("submit")).click();
       // String exptitle = "Login: Mercury Tours";
       // String acttitle =driver.getTitle();
       // System.out.println(acttitle);
        /*
        if(exptitle.equals(acttitle)==true) {
        	System.out.println("Test is passed");
        	
        		
        	}
        else {
        	System.out.println("Test is failed");
        	
        }*/
        //driver.close();
	}

}
