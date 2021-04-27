package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import testBase.TestBase;



public class search extends TestBase{
	
	@Test(priority=0)
public void searh() { 
				
		// Clicking the Login button
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Confirming page has loaded completely by checking for an element
		driver.findElement(By.xpath("//*[@id='masthead']/div/div/div/div")).isDisplayed();
		
		// Variable containing search parameter
		String Stext = "louis vuitton";
		
		//Entering search parameters
		String seachbx = "//*[@id='woocommerce-product-search-field-0']";
		WebElement Srchfld = driver.findElement(By.xpath(seachbx));
		Srchfld.sendKeys(Stext);
		
		//Clicking the search button
		String schbutton = "//*[@id='post-19']/div/div/div/div/section[2]/div/div/div/div/div/div[3]/div/form/button";
		driver.findElement(By.xpath(schbutton)).click();
		
		String hmbtn = "//*[@id='menu-item-22']/a";
		driver.findElement(By.xpath(hmbtn)).click();
		
	}


}
