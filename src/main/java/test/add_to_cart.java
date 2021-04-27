package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import testBase.TestBase;

public class add_to_cart extends TestBase{
	
	
	
	@Test(priority=1)
public void sin() { 
				
		// Clicking the Login button
				
				
				
				// Product Variable
				String product = "//*[@id='post-19']/div/div/div/div/section[3]/div/div/div/div/div/div[4]/div/div/div/ul/li[2]/div[1]/a[1]";
				
				//clicking product
				WebElement prdslct = driver.findElement(By.xpath(product));
				prdslct.click();
				
				//Clicking the login button
				String addcart = "//*[@id='product-265']/div[2]/form/button";
				driver.findElement(By.xpath(addcart)).click();
		
	}


}
