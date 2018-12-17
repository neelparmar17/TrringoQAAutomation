package com.hashedin.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hashedin.pageObject.PricingObject;
import com.hashedin.pageObject.HomeScreen;
import com.hashedin.resources.BaseClass;
import com.hashedin.resources.loginPage;

import junit.framework.Assert;

public class PricingHubPricingAddPriceSpecificImplement extends loginPage {
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws Exception{
		
		
		driver = login();
	log.info("Login to Web Url");
	}
	
	@Test
	public void hubPricing() throws Exception {
		HomeScreen hs = new HomeScreen(driver);
		BaseClass base = new BaseClass();
		PricingObject pricing = new PricingObject(driver);
		hs.getPricing().click();
		base.getWait(1000);
		hs.getFPricing().click();
		base.getWait(1000);
		
		pricing.getHubButton().click();
		base.getWait(1000);
		pricing.getHubSearch().sendKeys(prop.getProperty("HubSearch"));
		base.getWait(500);
		pricing.getHubDropDown().click();
		base.getWait(500);
		pricing.getImplementSearch().sendKeys(prop.getProperty("implementName"));
		base.getWait(500);
		pricing.getSearchButton().click();
		base.getWait(2000);
		pricing.getImplementSpecList().click();
		base.getWait(1000);
		pricing.getEditButton().click();
		pricing.getPerAcreStandard().clear();
		base.getWait(2000);
		pricing.getPerAcreStandard().sendKeys(prop.getProperty("price"));
		pricing.getDatePicker().click();
		base.getWait(2000);
		pricing.getDate().click();
		base.getWait(2000);
		pricing.getOkButton().click();
		base.getWait(2000);
		pricing.getPublishButton().click();
		
		base.getWait(4000);
		
		Assert.assertEquals(prop.getProperty("price"), pricing.getPerAcreStandard().getAttribute("value"));
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}

}
