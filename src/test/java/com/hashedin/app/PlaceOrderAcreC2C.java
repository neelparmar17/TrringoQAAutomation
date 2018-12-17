package com.hashedin.app;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hashedin.pageObject.AgentObjects;
import com.hashedin.pageObject.HomeScreen;
import com.hashedin.pageObject.OrdersObject;
import com.hashedin.pageObject.PlaceOrderObj;
import com.hashedin.resources.BaseClass;
import com.hashedin.resources.loginPage;

import junit.framework.Assert;

public class PlaceOrderAcreC2C extends loginPage {

	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	@Test
	
	public void PlaceOrderc2cAcr() throws Exception{
		
		PlaceOrderObj po = new PlaceOrderObj(driver);
		HomeScreen hs = new HomeScreen(driver);
		BaseClass base = new BaseClass();
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
		base.getWait(3000);
		po.getAcrPrc().click();
		
		
		//Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		base.getWait(3000);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='implements-table']/tbody/tr[1]/td[2]/div/div[2]/span/span/img")) );
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;

		//jse.executeScript("scroll(0, 250);");
        po.getacrstdSKU().click();
		po.getOpArea().sendKeys("2");
		//po.getOpDuration().sendKeys("2");
		//Thread.sleep(3000);
		base.getWait(3000);
		po.getSelectDay().click();
		po.getHours().sendKeys("3");
		po.getMin().sendKeys("30");
		po.getSelectPM().click();
		po.getPlaceOrder().click();
		
		Assert.assertEquals("Live Orders", oo.gettxt().getText());
		
		
				
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
	

	
	
}