package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class InvalidLoginTest extends BaseTest {
	
	
	@Test
	public void test()
	{
		Reporter.log("Test");
	}
	
	@Test
	public void testInvalidLogin()
	
	{
		String loginTitle = ExcelData.getData(file_path, "Login", 1, 2);
		String iuser = ExcelData.getData(file_path, "Login", 2, 0);
		String ipass = ExcelData.getData(file_path, "Login", 2, 1);
		
		
		
		LoginPage lp = new  LoginPage(driver);
		
		//verify the title of the login page
		lp.verifytheTitle(loginTitle);
		
		//enter invalid username
		lp.enterUserName(iuser);
		
		//enter invalid password
		lp.enterPassword(ipass);
		
		
		//click on Login
		lp.clickOnLogin();
		
		//verify error message
		lp.verifyErrMsg();
		
		
		
	}

}
