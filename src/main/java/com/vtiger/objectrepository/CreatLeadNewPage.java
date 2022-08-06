package com.vtiger.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author milan
 *
 */
public class CreatLeadNewPage {
	public CreatLeadNewPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//img[@title='Create Lead...']")
	private WebElement CreateLead;
	//provide Gretters
	public WebElement getCreatLeadPage() {
		return CreateLead;
	}
	//business logic
	public void CreateLead() {
		CreateLead.click();
		
		
	}
	
	

}
