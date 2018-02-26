package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	// for listBox
	public static void selectByIndex(WebElement element,int index)
	{
		Select select = new Select(element);//import from selenium.support.ui
		select.selectByIndex(index);
	}
	
	public static void selecByValue(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectByVisibleTest(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	//Dropdown menu
	
	public static void movetoElement(WebDriver driver,WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).click().perform();
	}
	
	//Hiddendivision popup
	
	
	

}
