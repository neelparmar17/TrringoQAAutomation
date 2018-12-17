package com.hashedin.app;

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

public class StopOrder extends loginPage {

	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	@Test
	
	public void stopOrder() throws Exception{
		
		PlaceOrderObj po = new PlaceOrderObj(driver);
		HomeScreen hs = new HomeScreen(driver);
		BaseClass base = new BaseClass();
		OrdersObject oo = new OrdersObject(driver);
		hs.getAgent().click();
		AgentObjects ao = new AgentObjects(driver);
		ao.getCustNumber().sendKeys(prop.getProperty("ExeOrderId"));
		ao.getSearch().click();
		
		oo.getsupplierTab().click();
		
		base.getWait(3000);
		
		oo.getStartOrder().click();
		base.getWait(3000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		oo.getalertyes().click();
		
		base.getWait(2000);
		
		Assert.assertEquals("Work Completed", oo.getStopTxt().getText());
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
	
	
}

