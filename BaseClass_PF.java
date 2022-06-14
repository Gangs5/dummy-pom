package StepsDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_PF {
	
	public static WebDriver driver;
	
	
	
	public void setUpClass() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
					
		
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
		
    driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	((Properties) driver).getProperty("url");
	
		
	}

}
