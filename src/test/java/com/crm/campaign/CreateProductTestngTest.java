package com.crm.campaign;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autodesk.genericutility.BaseClass;
import com.autodesk.genericutility.ExcelUtility;
import com.autodesk.genericutility.JavaUtility;
import com.autodesk.genericutility.WebDriverUtility;
import com.vtiger.objectrepository.CampaignPage;
import com.vtiger.objectrepository.CreateNewProductPage;
import com.vtiger.objectrepository.HomePage;
import com.vtiger.objectrepository.LoginPage;
import com.vtiger.objectrepository.ProductInformationPage;
import com.vtiger.objectrepository.ProductPage;
import com.vtiger.objectrepository.ProductPopupPage;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(com.autodesk.genericutility.IListenerImplClass.class)
public class CreateProductTestngTest extends BaseClass {
	
	@Test(groups = "Smoke")
	public void createProduct() throws Exception {
	
		
		HomePage hp=null;
		LoginPage lp=null;
		CampaignPage cp=null;
		ProductPage pp=null;
		ProductPopupPage prodPopup=null;
		
		ExcelUtility eu=new ExcelUtility();
		WebDriverUtility wdu=null;
		JavaUtility ju=new JavaUtility();
		CreateNewProductPage cnprod=null;
		ProductInformationPage prodinfo=null;
			

		/* Retrive Excel File Data */
		String product = eu.getExcelCellData("Organization", 2, 4);
		String campaign = eu.getExcelCellData("Organization", 2, 5);

		/* Generate Random data to make a each data unique while saving */
		product = product + "_" + ju.getRandomNumber(1000);
		campaign = campaign + "_" + ju.getRandomNumber(1000);
				
		/* create Product */
		hp=new HomePage(driver);
		hp.getProductLink().click();
		pp=new ProductPage(driver);
		pp.getCreateProductIcon().click();
		cnprod=new CreateNewProductPage(driver);
		cnprod.createProduct(product);
		cnprod.save();
		
		/*Validation*/
		prodinfo=new ProductInformationPage(driver);
		String getval=prodinfo.getSavedTitle().getText();
		
		if(getval.contains(product)) {
		}
		else
			System.out.println("Validation Fail"); 
		
	
	}

}
