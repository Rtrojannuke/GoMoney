package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	
	public WebDriver driver;
	// String browser;
	static String projectrail = System.getProperty("user.dir");

	
	
@BeforeTest()
public void beforerunning() {
	
	System.setProperty("webdriver.gecko.driver", projectrail+"//bdriver//geckodriver");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://letskodeit.com/automationpractice/");	
	driver.getTitle();	
	
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
}


@AfterTest
public void afterrunning() {
	
	//Closing browser
	driver.close();
}
	
	

}
