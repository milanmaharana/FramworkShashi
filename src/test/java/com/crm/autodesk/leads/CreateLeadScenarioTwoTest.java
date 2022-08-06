package com.crm.autodesk.leads;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.autodesk.genericutility.BaseClass;
import com.autodesk.genericutility.ExcelUtility;
import com.vtiger.objectrepository.CreatingNewLeadPage;
import com.vtiger.objectrepository.HomePage;
import com.vtiger.objectrepository.LeadPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadScenarioTwoTest extends BaseClass {

	@Test
	public void createleads() throws Exception {
		ExcelUtility excel=new ExcelUtility();
		//clicking home page
		HomePage hp=new HomePage(driver);
		hp.getLeadsLink().click();
		LeadPage lead=new LeadPage(driver);
		//clicking new leadpage
		lead.getCreateleadicon().click();
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		//fatching data form exel sheet
		cnlp.getlastname().sendKeys(excel.getExcelCellData("Organization", 1, 3));
		cnlp.getCompanyTextField().sendKeys(excel.getExcelCellData("Organization", 1, 0));
		
		cnlp.getSaveButton().click();
	}



}
