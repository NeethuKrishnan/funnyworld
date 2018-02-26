package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class ValidLoginLogoutTest extends BaseTest{
	
	@Test
	public void testValidLoginLogout()
	{
		String loginTitle = ExcelData.getData(file_path,"Login", 1, 2);
		String user = ExcelData.getData(file_path, "Login", 1, 0);
		String pass = ExcelData.getData(file_path, "Login", 1, 1);
		
		String enterTimeTrackTitle = ExcelData.getData(file_path, "EnterTimeTrack", 1, 0);
		
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
		System.out.println(driver.getTitle());
		
		
		//verify login title
	     lp.verifytheTitle(loginTitle);
		
		
		//Enter valid Username
		
		lp.enterUserName(user);
		
		//enter valid password
		
		lp.enterPassword(pass);
		
		//click on login
		lp.clickOnLogin();
		
		//verify actitime Enter-Time-TrackPage
		lp.verifytheTitle(enterTimeTrackTitle);
		
		//click on Logout
		ep.clickOnLogout();
		
		//verify login title
		lp.verifytheTitle(loginTitle);
		
		
	}
	

	
	
	
	
}
