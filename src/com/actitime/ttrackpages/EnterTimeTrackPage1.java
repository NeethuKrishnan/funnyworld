package com.actitime.ttrackpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;
import com.actitime.generic.GenericUtils;

public class EnterTimeTrackPage1 extends BasePage{
	
	
	

		
		//decalarion
		
		@FindBy (xpath="//span[.='Add Recent Task']")
		private WebElement addRecentTaskDM;
		
		
		@FindBy (xpath="//span[.='Add Tasks from the List']")
		private WebElement addTaskFromtheListLink;
		
		
		
		@FindBy (xpath="/html/body/div[7]/form/table/tbody/tr/td/table[1]/tbody/tr[3]/td[1]/table/tbody/tr/td[6]/a/img")
		private WebElement newLink;
		
		
		@FindBy (xpath="//a[contains(text(),' Select Customer ')]")
		private WebElement selectCustomerDM;
		
		
		@FindBy (xpath="//button[contains(.,'Select Project')]")
		private WebElement selectProjectDM;
		
		
		@FindBy (id="createTasksPopup_newProject")
		private WebElement eneterProjectNameTB;

		@FindBy (xpath="(//input[@class='inputFieldWithPlaceholder'])[1]")
		private WebElement enterTaskNameTF;
		
		@FindBy (id="(descriptionElement)[1]")
		private WebElement enterTaskdescriptionLNK;
		
		
		@FindBy (xpath="//td[@class='lightPopupHeader']/../..")
		private WebElement editTaskDescriptionPopUP;
		
		@FindBy(id="scbutton")
		private WebElement editTaskOkbtn;
		
		//to identify new customer from list
		@FindBy(xpath="(//a[@class='x-menu-item'])[2]")
		private WebElement newCustomerelmt;
		
		@FindBy(id="createTasksPopup_newCustomer")
		private WebElement enterNewCustomerName;
		
		
		@FindBy	(id="createTasksPopup_newProject")
		private WebElement enterProjectName;
		
		@FindBy	(xpath="//span[.='Create Tasks']")
		private WebElement createTaskBTN;
		
		
		@FindBy	(xpath="//*[@id='taskNameCell101']")
		private WebElement verifyTask;
		
		
		
		
		
		
		//initialization
		public EnterTimeTrackPage1(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
			
			
		}
		
		//utilization
		
		
		public void clickOnNewLink()
		{
			newLink.click();
		}
		
		public void selectCustomer()
		{
		
			selectCustomerDM.click();
			GenericUtils.movetoElement(driver, newCustomerelmt);
			//GenericUtils.selectByIndex(newCustomerelmt,1);
			
		}
		
		public void enterCustomerName(String newcustomername)
		{
			enterNewCustomerName.sendKeys(newcustomername);
		}
		public void enterProjectName(String projectname)
		{
			enterProjectName.sendKeys(projectname);
		}
		
		public void createTask(String taskname )
		{
			enterTaskNameTF.sendKeys(taskname);
			//enterTaskdescriptionLNK.click();
			//editTaskDescriptionPopUP.sendKeys(description);
			//editTaskOkbtn.click();
			
		}
		public void clickOnCreateTasks()
		{
			createTaskBTN.click();
		}
		


}
	
	


