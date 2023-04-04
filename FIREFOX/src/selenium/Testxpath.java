package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//public static void highlight(WebElement element) {
		
		//JavascriptExecutor jsExecutor = (JavascriptExecutor)driver ;
		//jsExecutor.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow');",element);
		
		//public static void chapter3() {
		driver.get("https://www.dollardays.com/");
		//driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div[2]/div[3]/div/div[2]")).sendKeys("clothing");
		//driver.findElement(By.xpath("//input[@placeholder='Search for items in bulk']")).sendKeys("clothing");
		//driver.findElement(By.xpath("//span[@class='search_btn']")).click();
		//driver.findElement(By.name("terms")).sendKeys("food");
		//driver.findElement(By.xpath("//div[@class='search-dummy hidden-lg hidden-xs']")).sendKeys("shoes");
		//driver.switchTo().frame("hkoAccessibilityFrame");
		//driver.findElement(By.xpath("//div[@class='search-dummy hidden-lg hidden-xs']")).sendKeys("shoes");
		//div[@class='search-dummy hidden-lg hidden-xs']
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//form[@name='aspnetForm']//following::div[@class='search-dummy hidden-lg hidden-xs']")).sendKeys("shoes");
		driver.findElement(By.cssSelector("img[src=\"//dm61q01mhxuli.cloudfront.net/branding/www/new_dollardays.png?auto=compress,format&w=400&bg=FFFFFF&trim=color&fit=fillmax\"]\r\n"
				+ "")).click();
	
	}
}

	
    



