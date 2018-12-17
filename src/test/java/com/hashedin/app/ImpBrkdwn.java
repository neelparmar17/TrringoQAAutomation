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

public class ImpBrkdwn extends loginPage {

	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	@Test
	
	public void ImpBD() throws Exception{
		
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
		
		oo.getreportBreakdown().click();
		base.getWait(3000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		oo.getImpBreakdown().click();
		base.getWait(1000);
		oo.getconfrmBD().click();
		
		base.getWait(2000);
		
		Assert.assertEquals("Implement Breakdown", oo.getimpBDTxt().getText());
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
	
	
}


