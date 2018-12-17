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

public class AssignOperatortoOrder extends loginPage {

	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	@Test
	
	public void assignOp2Order() throws Exception{
		
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
		
		oo.getAssignOp().click();
		base.getWait(3000);
		oo.getselectOp().click();
		base.getWait(3000);
		oo.getassignBtn().click();
		base.getWait(2000);
		
		Assert.assertEquals("Operator Assigned", oo.getopStatus().getText());
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
	
	
}
