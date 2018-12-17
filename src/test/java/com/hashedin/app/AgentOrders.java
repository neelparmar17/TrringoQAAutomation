package com.hashedin.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.hashedin.pageObject.AgentObjects;
import com.hashedin.pageObject.HomeScreen;
import com.hashedin.resources.BaseClass;
import com.hashedin.resources.loginPage;

public class AgentOrders extends loginPage {
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	
	
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void initialize() throws Exception{
		
		driver = login();
	
	}
	
	
	@Test
	public void Agent() throws Exception{
		/*loginPage lp = new loginPage(driver);
		lp.loginPage(driver);*/
		//AppNavigation an= new AppNavigation();
		//an.loginApp();
		HomeScreen hs = new HomeScreen(driver);
		hs.getAgent().click();
		//hs.getPricing().click();
		AgentObjects ao = new AgentObjects(driver);
		ao.getCustNumber().sendKeys(prop.getProperty("mobilenumber"));
		ao.getSearch().click();
				
	}
		
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
	

}

