package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class VerifyBuildNumberTest extends BaseTest {
	
	
	@Test
	public void testBuildNumber() throws InterruptedException
	{String loginTitle = ExcelData.getData(file_path,"Login", 1, 2);
	String user = ExcelData.getData(file_path, "Login", 1, 0);
	String pass = ExcelData.getData(file_path, "Login", 1, 1);
	
	String enterTimeTrackTitle = ExcelData.getData(file_path, "EnterTimeTrack", 1, 0);
	String build = ExcelData.getData(file_path, "EnterTimeTrack", 1, 1);
	
	LoginPage lp = new LoginPage(driver);
	EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
	
	lp.verifytheTitle(loginTitle);
	lp.enterUserName(user);
	lp.enterPassword(pass);
	lp.clickOnLogin();
	lp.verifytheTitle(enterTimeTrackTitle);
	ep.clickOnHelp();
	Thread.sleep(3000);
	ep.clickOnAboutYourActitime();
	ep.verifyBuildNo(build);
	
	
	
		
	}
	

}
