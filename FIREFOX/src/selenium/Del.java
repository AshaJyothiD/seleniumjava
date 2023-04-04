package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Del {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement admin = driver.findElement(By.id("Email"));
		//admin.clear();
		//admin.sendKeys("asha@gmail.com");
		System.out.println(admin.getAttribute("value"));
		System.out.println("the answer is" + admin.getText());
		WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
        System.out.println( element.getAttribute("type"));
        System.out.println(element.getAttribute("class"));
        System.out.println(element.getText());
       String name = driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
       System.out.println(name);
        
	}

}
