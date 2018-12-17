package com.hashedin.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hashedin.pageObject.AgentObjects;
import com.hashedin.pageObject.HomeScreen;
import com.hashedin.pageObject.newRegistrationObjects;
import com.hashedin.resources.BaseClass;
import com.hashedin.resources.loginPage;

public class FarmerRegistration extends loginPage{
	
public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	
	
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	
	@Test
	public void registerFarmer() throws Exception{
		/*loginPage lp = new loginPage(driver);
		lp.loginPage(driver);*/
		//AppNavigation an= new AppNavigation();
		//an.loginApp();
		HomeScreen hs = new HomeScreen(driver);
		hs.getAgent().click();
		//hs.getPricing().click();
		AgentObjects ao = new AgentObjects(driver);
		ao.getCustNumber().sendKeys(prop.getProperty("newnumber"));
		ao.getSearch().click();
		newRegistrationObjects register = new newRegistrationObjects(driver);
		BaseClass base = new BaseClass();
		base.getWait(5000);
		register.getvilExpState().click();
		register.getstate().click();
		base.getWait(5000);
		register.getvilExpDist().click();
		base.getWait(3000);
		register.getdist().click();
		base.getWait(5000);
		register.getvilExpTaluka().click();
		base.getWait(3000);
		register.gettaluka().click();
		base.getWait(5000);
		register.getvillage().click();
		register.getregisterButton().click();
		
		register.getFrstNam().sendKeys(prop.getProperty("FarmerFN"));
		register.getLastNam().sendKeys(prop.getProperty("FarmerLN"));
		Thread.sleep(3000);
		//base.getExpWaitTime(5, "//h5[contains(text(),'Enter Farmland Details:')]");
		register.getfarmLocation().click();
		register.getFarmSize().sendKeys(prop.getProperty("Farmsize"));
		Select select = new Select(register.getCrop());
		select.selectByValue("Sugarcane");
		select.selectByValue("Paddy");
		select.selectByValue("Wheat");
		select.selectByValue("Mango");
		select.selectByValue("Soya");
		register.getSlctsrc().click();
		register.getSource().click();
		register.getSave().click();
		
		
		
		
				
	}
		
//	@AfterTest
//	public void tearDown(){
//		driver.close();
//		driver=null;
//	}

}
