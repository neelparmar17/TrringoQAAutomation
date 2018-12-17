package com.hashedin.app;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hashedin.pageObject.AgentObjects;
import com.hashedin.pageObject.HomeScreen;
import com.hashedin.pageObject.OrdersObject;
import com.hashedin.pageObject.PlaceOrderObj;
import com.hashedin.resources.BaseClass;
import com.hashedin.resources.loginPage;

import junit.framework.Assert;

public class PlaceOrderC2C extends loginPage {

	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	@Test
	
	public void PlaceOrderC2CHr() throws Exception{
		
		PlaceOrderObj po = new PlaceOrderObj(driver);
		HomeScreen hs = new HomeScreen(driver);
		hs.getAgent().click();
		AgentObjects ao = new AgentObjects(driver);
		ao.getCustNumber().sendKeys(prop.getProperty("mobilenumber"));
		ao.getSearch().click();
		OrdersObject oo = new OrdersObject(driver);
		oo.getNewEnquiry().click();
		Select select = new Select(po.getfarmland());
		select.selectByIndex(2); 
		po.getImplementName().sendKeys(prop.getProperty("implementName"));
		po.getSearchImp().click();
		//Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,30);
        BaseClass base = new BaseClass();
        base.getExpWaitTime(5,"//li[@value='PER_HOUR'][contains(text(),'Per Hour')]");
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='implements-table']/tbody/tr[1]/td[2]/div/div[2]/span/span/img")) );
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;

		//jse.executeScript("scroll(0, 250);");
		po.getSeletSpec().click();
		po.getOpArea().sendKeys("2");
		po.getOpDuration().sendKeys("2");
		//Thread.sleep(3000);
		base.getImpWaitTime(5);
		po.getSelectDay().click();
		po.getHours().sendKeys("3");
		po.getMin().sendKeys("30");
		po.getSelectPM().click();
		po.getPlaceOrder().click();
		
		Assert.assertEquals("Live Orders", oo.gettxt().getText());
		
		
				
	}

	
	
}
