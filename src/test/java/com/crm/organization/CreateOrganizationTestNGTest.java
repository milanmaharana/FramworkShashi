package com.crm.organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autodesk.genericutility.BaseClass;
import com.autodesk.genericutility.ExcelUtility;
import com.autodesk.genericutility.JavaUtility;
import com.vtiger.objectrepository.CreateNewOrganizationPage;
import com.vtiger.objectrepository.HomePage;
import com.vtiger.objectrepository.OrganizationInformationPage;
import com.vtiger.objectrepository.OrganizationsPage;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(com.autodesk.genericutility.IListenerImplClass.class)
public class CreateOrganizationTestNGTest extends BaseClass {
	
	@Test(groups = "Integration")
	public void createOrg()throws Exception {
		
		OrganizationsPage op=null;
		ExcelUtility eu=new ExcelUtility();
		JavaUtility ju=new JavaUtility();
		CreateNewOrganizationPage cnorg=null;
		OrganizationInformationPage orginfo=null;
		
		
		/* Excel Files */
		String industry=eu.getExcelCellData("Organization", 3, 1);
		String lastName=eu.getExcelCellData("Organization", 3, 3);
		String orgName=eu.getExcelCellData("Organization", 3, 0);
		
		/*Generate Random Number*/
		orgName=orgName+"_"+ju.getRandomNumber(100);
		lastName=lastName+"_"+ju.getRandomNumber(100);
						
		/* Create Organisation */
		hp=new HomePage(driver);
		hp.getOrgLink().click();
		op=new OrganizationsPage(driver);
		op.getCreateOrgIcon().click();
		cnorg=new CreateNewOrganizationPage(driver);
		cnorg.createOrgRecordWithMandatoryField(orgName);
		
		WebElement selectIndustry=cnorg.getIndustryfieldDropDown();
		wdu.select(selectIndustry, industry);
		cnorg.getSaveButton().click();
		
		/*Validation*/
		orginfo=new OrganizationInformationPage(driver);
		String getval=orginfo.getSaveTitle().getText();
		
		if(getval.contains(orgName)) {
			System.out.println("Validationn Pass");
		}
		else
			System.out.println("Validation Fail"); 
		
		
	}
	}

