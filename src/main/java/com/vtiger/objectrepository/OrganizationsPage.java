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
public class OrganizationsPage {
	/**
	 * It is Use for Initialize the variables with WebElements 
	 * @param driver
	 */
	public OrganizationsPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "img[title='Create Organization...']")
	private WebElement createOrgIcon;

	public WebElement getCreateOrgIcon() {
		return createOrgIcon;
	}
	
	
	
	
}
