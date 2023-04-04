package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathaxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/dailygroupa");
		driver.manage().window().maximize();
		//self
		String self=driver.findElement(By.xpath("//a[contains(text(),'Pan Electronics')]/self::a")).getText();
		System.out.println(self);
		//parent
		String parent=driver.findElement(By.xpath("//a[contains(text(),'Pan Electronics')]/parent::td")).getText();
		System.out.println(parent);
		//List<WebElement> childs = driver.findElement(By.xpath("//a[contains(text(),'Pan Electronics')]/ancestor::tr/child::td"));
		//System.out.println(childs.size());

	}

}
