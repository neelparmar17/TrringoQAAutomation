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

public class SupplierAcceptOrder extends loginPage {

	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	@Test
	
	public void c2cAcceptOrder() throws Exception{
		
		PlaceOrderObj po = new PlaceOrderObj(driver);
		HomeScreen hs = new HomeScreen(driver);
		BaseClass base = new BaseClass();
		OrdersObject oo = new OrdersObject(driver);
		hs.getAgent().click();
		AgentObjects ao = new AgentObjects(driver);
		ao.getCustNumber().sendKeys(prop.getProperty("suppliernumber"));
		ao.getSearch().click();
		base.getWait(3000);
		oo.getsupplierTab().click();
		
		String orderId = oo.getOrderId().getText();
		
		base.getWait(3000);
		oo.getaccept().click();
		//base.getWait(2000);
		Thread.sleep(3000);
		oo.getacceptcnfrm().click();
		base.getWait(3000);
		ao.getOrders().click();
		base.getWait(1000);
		ao.getCustNumber().sendKeys(orderId);
		ao.getSearch().click();
		
		base.getWait(1000);
		
		Assert.assertEquals("Aggregator Assigned", oo.getacceptedTxt().getText());
		
		
				
	}
	
//	@AfterTest
//	public void tearDown(){
//		driver.close();
//		driver=null;
//	}
//	

	
	
}
