package com.vtiger.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	
	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createleadicon;
	
	
	
	public WebElement getCreateleadicon() {
		return createleadicon;
	}

	public void LeadPage() {
		createleadicon.click();
	}
	
}
