package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {

	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	//to verify the title
	public void verifyTitle(String eTitle)
	{
		try{
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("title is matching:"+eTitle,true);
		
		}
		catch(Exception e)
		{
		Reporter.log("title is not matching:",true);
		String t = driver.getTitle();
		System.out.println(t);
		Assert.fail();// take the fail having org.testNG.assert
		}
		
	}
	//to verify elements
	
	public void verifyElement(WebElement element)
	{
		try{
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOf(element));
		 Reporter.log("element is present",true);
		}
		
		catch(Exception e)
		{
			Reporter.log("element not present",true);
			Assert.fail();
		}
		
		
	}
	
	
	
}
