package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import testBase.TestBase;


public class view_cart extends add_to_cart{
	
@Test(priority =2)	
	public void cart() {
		
		
	
		
		//Clicking cart button 
		String cartbtn = "//*[@id='ast-site-header-cart']/div[1]/a/div";
		WebElement cartbttn = driver.findElement(By.xpath(cartbtn));
		cartbttn.click();
		
		//Page Confirmation
		driver.findElement(By.xpath("//*[@id='post-5']/div/div/form/table")).isDisplayed();
	}
	

}
