package com.hashedin.app;





import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.hashedin.pageObject.AgentObjects;
import com.hashedin.pageObject.HomeScreen;
import com.hashedin.pageObject.OrdersObject;
import com.hashedin.resources.BaseClass;
import com.hashedin.resources.loginPage;

public class Orders extends loginPage {
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	public WebDriver driver;


	
	@BeforeTest
	public void initialize() throws Exception{
		
		
		driver = login();
	log.info("Login to Web Url");
	}
	
	@Test
	
	public void newEquiry() throws Exception{
		
		HomeScreen hs = new HomeScreen(driver);
		hs.getAgent().click();
		log.info("Clicked on agent tab");
		AgentObjects ao = new AgentObjects(driver);
		ao.getCustNumber().sendKeys(prop.getProperty("mobilenumber"));
		log.info("Mobile number entered");
		ao.getSearch().click();
		log.info("Mobile number searched");
		OrdersObject oo = new OrdersObject(driver);
		oo.getNewEnquiry().click();
		log.info("Clicked on enquiry");
				
	}

}
