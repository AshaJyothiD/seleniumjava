package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours {

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.navigate().to("http://www.calculator.net/percent-calculator.html");
		
		driver.findElement(By.name("c21par1")).sendKeys("20");
		driver.findElement(By.name("c21par2")).sendKeys("3");
		//Thread.sleep(5000);

	      // Get the text box from the application
	      //String result = driver.findElement(By.id("cpar1")).getAttribute("value");

	      // Print a Log In message to the screen
	//System.out.println(" The Result is " + result);

	      // Close the Browser.
	//driver.close();
	driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td[2]/input[2]")).click();
	System.out.println("The Output of the IsSelected " + 
	driver.findElement(By.id("cpayoff1")).isSelected());


	}

}
