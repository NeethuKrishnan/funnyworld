package com.actitime.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try
		{
		ITestNGMethod gm = result.getMethod();//get the failed method
		String name = gm.getMethodName();//get the failed method name
		//to take the screenshot
		EventFiringWebDriver e = new EventFiringWebDriver(BaseTest.driver);
		File src = e.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+name+".png");
		FileUtils.copyFile(src, dest);
		
		}
		catch(Exception e1)
		{
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
