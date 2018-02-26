package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actitime.generic.BasePage;

public class EnterTimeTrackPage extends BasePage {

	//Declaration
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	
	@FindBy(xpath="(//div[contains(@class,'popup_menu_arrow')])[3]")
	private WebElement helpDDMenu;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutACTI;
	
//	@FindBy(id="aboutProductInfoTable")
	//private WebElement HiddenPOPUP;
	
	@FindBy(xpath="//span[text()='(build 39769)']")
	private WebElement buildno;
	
	
	
	//Intialization
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	//Utilization
	
	public void clickOnLogout()
	{
		logoutBTN.click();
	}
	
	public void clickOnHelp()
	{
		helpDDMenu.click();
	}
	public void clickOnAboutYourActitime()
	{
		aboutACTI.click();
		
		
	}
	public void verifyBuildNo(String ebuildNO)
	{
		String abuildNO = buildno.getText();
		Assert.assertEquals(abuildNO, ebuildNO);
	}
	
	
	
}
