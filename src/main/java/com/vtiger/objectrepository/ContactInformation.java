package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Milan
 *
 */
public class ContactInformation {
	
	/**
	 * It is Use for Initialize the variables with WebElements
	 * @param driver
	 */
	public ContactInformation(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(className  = "dvHeaderText")
	private WebElement savedTitle;
	
	public WebElement getSavedTitle() {
		return savedTitle;
	}
}
