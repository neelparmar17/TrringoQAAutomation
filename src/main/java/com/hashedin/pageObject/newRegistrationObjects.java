package com.hashedin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newRegistrationObjects {
	
	public WebDriver driver;
	
	
	 By locationTriplate = By.id("//input[@id='all-locations']");
	 By locationSubmit = By.xpath("//button[@id='register-customer']");
	 By vilExpState = By.xpath("//input[@value='Select State']");
	 By vilExpDist = By.xpath("//input[@value='Select District']");
	 By vilExpTaluka = By.xpath("//input[@value='Select Taluka']");
	 By village = By.xpath("//li[contains(text(),'Demo Village3')]");
	 By registerButton = By.xpath("//button[@id='show-farmer-form']");
	 By state = By.xpath("//span[contains(text(),'Demo State')]");
	 By dist = By.xpath("//span[contains(text(),'Demo District')]");
	 By taluka = By.xpath("//span[contains(text(),'Demo Taluka')]");
	 
	 By frstNam = By.xpath("//input[@id='first-name']");
	 By lastNam = By.xpath("//input[@id='last-name']");
	 By farmLocation = By.xpath("//input[@type='checkbox']");
	//By.xpath("//h5[contains(text(),'Enter Farmland Details:')]");
			 //By.xpath("//input[@id='same-as-residential-checkbox']");
	 By farmSize = By.xpath("//input[@id='total-area']");
	 By selectCrop = By.xpath("//select[@id='farm-crops']");
	 By source = By.xpath("//span[contains(text(),'Select Source')]");
	 By selectSrc = By.xpath("//span[contains(text(),'Voice calls')]");
	 By saveBtn =  By.xpath("//button[@id='save-farmer']");
	 By cancelBtn = By.xpath("//a[@id='cancel-farmer-registration']");
	 
	 
	 
	 
	 
	  
		public newRegistrationObjects(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver =  driver;
		}

		public WebElement getlocationTriplate(){
		return driver.findElement(locationTriplate);
		}
		
		public WebElement getstate(){
		return driver.findElement(state);
		}
		
		public WebElement getdist(){
		return driver.findElement(dist);
		}
		
		public WebElement gettaluka(){
		return driver.findElement(taluka);
		}
		
		public WebElement getlocationSubmit(){
		return driver.findElement(locationSubmit);
		}
		
		public WebElement getvilExpState(){
		return driver.findElement(vilExpState);
		}
		
		
		public WebElement getvilExpDist(){
		return driver.findElement(vilExpDist);
		}
		
		public WebElement getvilExpTaluka(){
		return driver.findElement(vilExpTaluka);
		}
			
			
		public WebElement getregisterButton(){
		return driver.findElement(registerButton);
		}
		
		public WebElement getvillage(){
		return driver.findElement(village);
		}
		
		public WebElement getFrstNam(){
		return driver.findElement(frstNam);
		}
				
				
		public WebElement getLastNam(){
		return driver.findElement(lastNam);
		}
			
		public WebElement getfarmLocation(){
		return driver.findElement(farmLocation);
		}
		
		public WebElement getFarmSize(){
		return driver.findElement(farmSize);
		}
				
				
		public WebElement getCrop(){
		return driver.findElement(selectCrop);
		}
			
		public WebElement getSlctsrc(){
		return driver.findElement(selectSrc);
		}
		
		public WebElement getSource(){
		return driver.findElement(selectSrc);
		}
				
				
		public WebElement getSave(){
		return driver.findElement(saveBtn);
		}
			
		public WebElement getCancel(){
		return driver.findElement(cancelBtn);
		}
	 

}
