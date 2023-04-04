package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dollardays {
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Driver_sel\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		search();
	}
	public static void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border:5px solid red;background:yellow');",element);
	}
	public static void search() throws InterruptedException {
		driver.get("https://www.dollardays.com/");
		Thread.sleep(3000);
		highlight(driver.findElement(By.xpath("//h4[text()='Clothing']")));
		highlight(driver.findElement(By.xpath("//h4[@class='title-warp']")));
		Thread.sleep(3000);
		highlight(driver.findElement(By.cssSelector(".search_btn")));
		highlight(driver.findElement(By.cssSelector("div[class='search-dummy hidden-lg hidden-xs']")));
		highlight(driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div[2]/div[3]/div/div[2]")));
		driver.findElement(By.tagName("Search")).sendKeys("clothing");		
		
		
	}
}
        
		

