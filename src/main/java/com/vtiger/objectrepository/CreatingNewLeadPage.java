/**
 * 
 */
package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author milan
 *
 */
public class CreatingNewLeadPage {
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@name='lastname']" )
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyTextField;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileNumber;
	
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//provide gratter
	public WebElement getlastname() {
		return lastname;
	}
	
	public WebElement getCompanyTextField() {
		return companyTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	//provide business logic
		public void  sendlastname (String lastName ) {
			 lastname.sendKeys(lastName); 
		}
	public void sendCompanyName(String comname) {
		 companyTextField.sendKeys(comname);
		 saveButton.click();
	}
}
