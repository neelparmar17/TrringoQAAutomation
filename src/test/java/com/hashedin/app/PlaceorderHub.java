package com.hashedin.app;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hashedin.pageObject.AgentObjects;
import com.hashedin.pageObject.HomeScreen;
import com.hashedin.pageObject.OrdersObject;
import com.hashedin.pageObject.PlaceOrderObj;
import com.hashedin.resources.BaseClass;
import com.hashedin.resources.loginPage;

import junit.framework.Assert;

public class PlaceorderHub extends loginPage {

	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	@Test
	
	public void PlaceOrderHubFL() throws Exception{
		
		PlaceOrderObj po = new PlaceOrderObj(driver);
		HomeScreen hs = new HomeScreen(driver);
		hs.getAgent().click();
		AgentObjects ao = new AgentObjects(driver);
		ao.getCustNumber().sendKeys(prop.getProperty("mobilenumber"));
		ao.getSearch().click();
		OrdersObject oo = new OrdersObject(driver);
		oo.getNewEnquiry().click();
		Select select = new Select(po.getfarmland());
		select.selectByIndex(6); 
		po.getImplementName().sendKeys(prop.getProperty("implementName"));
		po.getSearchImp().click();
		//Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,30);
        BaseClass base = new BaseClass();
        base.getImpWaitTime(5);
        base.getWait(5000);
        //Thread.sleep(5000);
        //base.getExpWaitTime(10,"//tbody//tr[1]//td[3]//button[1]");
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='implements-table']/tbody/tr[1]/td[2]/div/div[2]/span/span/img")) );
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;

		//jse.executeScript("scroll(0, 250);");
		po.getSeletSKU().click();
		po.getOpArea().sendKeys("2");
		po.getOpDuration().sendKeys("2");
		//Thread.sleep(3000);
		base.getImpWaitTime(5);
		base.getWait(3000);
		po.getNAT().click();
		
		base.getImpWaitTime(5);
		po.getPlaceOrder().click();
		
		Assert.assertEquals("Live Orders", oo.gettxt().getText());
		
		
				
	}

	
}
