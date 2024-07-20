package Jenkins_Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jenkins_Git {
	WebDriver driver;

	public void test_Sample() {
	WebDriverManager.chromedriver().setup();

	driver=new ChromeDriver();
	
	WebElement username=driver.findElement(By.id("username"));
	
	username.sendKeys("sridevi@dayalan.com");
	
	WebElement password=driver.findElement(By.id("password"));
	
	password.sendKeys("");
	
	WebElement login=driver.findElement(By.id("Login"));
	
	login.click();
	
	}
	
	
}
