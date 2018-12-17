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

public class SearchOrder extends loginPage {

	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	@Test
	
	public void newEquirseacrhOrder() throws Exception{
		
		PlaceOrderObj po = new PlaceOrderObj(driver);
		HomeScreen hs = new HomeScreen(driver);
		
		OrdersObject oo = new OrdersObject(driver);
		hs.getAgent().click();
		AgentObjects ao = new AgentObjects(driver);
		ao.getCustNumber().sendKeys(prop.getProperty("OrderId"));
		ao.getSearch().click();
		
		Assert.assertEquals("Showing order details for Farmer.", oo.getordersearchtxt().getText());
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
	
	
}
