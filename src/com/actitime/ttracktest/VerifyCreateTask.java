package com.actitime.ttracktest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;


import com.actitime.pages.LoginPage;
import com.actitime.ttrackpages.EnterTimeTrackPage1;


	
	@Listeners(com.actitime.generic.ListenersTest.class)
	public class VerifyCreateTask extends BaseTest {
		
		
		@Test
		public void testCreateTask() throws InterruptedException
		{String loginTitle = ExcelData.getData(file_path,"Login", 1, 2);
		String user = ExcelData.getData(file_path, "Login", 1, 0);
		String pass = ExcelData.getData(file_path, "Login", 1, 1);
		
		String enterTimeTrackTitle = ExcelData.getData(file_path, "EnterTimeTrack", 1, 0);
		
		
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage1 ep1 = new EnterTimeTrackPage1(driver);
		
		
		lp.verifytheTitle(loginTitle);
		lp.enterUserName(user);
		lp.enterPassword(pass);
		lp.clickOnLogin();
		lp.verifytheTitle(enterTimeTrackTitle);
		Thread.sleep(3000);
		ep1.clickOnNewLink();
		Thread.sleep(3000);
		ep1.selectCustomer();
	    Thread.sleep(3000);
	    ep1.enterCustomerName("Nexa1");
	    Thread.sleep(1000);
	    ep1.enterProjectName("BULLDOSER Manufacturing1");
	    Thread.sleep(1000);
	    ep1.createTask("Resourcecollection");
	    Thread.sleep(1000);
	    ep1.clickOnCreateTasks();
	    Thread.sleep(1000);
		//ep1.enterProjectName("eppidittle");
		
		
		
			
		}
		

	}

	
	
	


