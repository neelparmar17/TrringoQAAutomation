package com.hashedin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeScreen {
	
	public WebDriver driver;
	
	 By pricing = By.xpath("//h5[contains(text(),'Pricing')]");
    By farmerpricing = By.xpath("//h5[contains(text(),'Farmer Pricing')]");
	By francommission = By.xpath("//h5[contains(text(),'Franchise Commission')]");
	By c2ccommission = By.xpath("//h5[contains(text(),'C2C Commission')]");
	By promotion = By.xpath("//h5[contains(text(),'Promotions')]");
	By farmerpromotion = By.xpath("//h5[contains(text(),'Farmer Promotion')]");
	By supplierpromotion = By.xpath("//h5[contains(text(),'Supplier Promotion')]");
	By franchpromotion = By.xpath("//h5[contains(text(),'Franchise Promotion')]");
	 By agent = By.xpath("//*[@id='outerHomeContainer']/div[2]/div/div/div/div[1]/div/div");
	By inventory = By.xpath("//h5[contains(text(),'Inventory')]");
	By live = By.xpath("//h5[contains(text(),'Live')]");
	By keys = By.xpath(" //h5[contains(text(),'Keys')]");
	By finance = By.xpath("//h5[contains(text(),'Finance')]");
	By reports = By.xpath("//input[@id='id_password']");
	By trringohome = By.xpath("//a[@onclick='sessionStorage.setItem('menu', 'inventory')']");
	By oldtrringo = By.linkText("Old Trringology");
	
	public HomeScreen(WebDriver driver){
		this.driver =  driver;
	}
	
	public WebElement getPricing(){
		return driver.findElement(pricing);
	}
	
	public WebElement getFPricing(){
		return driver.findElement(farmerpricing);
	}
	
	/*public WebElement getFPricing(){
		return driver.findElement(farmerpricing);
	}
	
	public WebElement getFCommission(){
		return driver.findElement(francommission);
	}
	
	public WebElement getC2CComm(){
		return driver.findElement(c2ccommission);
	}
	
	public WebElement getPromotion(){
		return driver.findElement(promotion);
	}
	
	public WebElement getFPromotion(){
		return driver.findElement(farmerpromotion);
	}
	
	public WebElement getSPromotion(){
		return driver.findElement(supplierpromotion);
	}
	
	public WebElement getFranPromotion(){
		return driver.findElement(franchpromotion);
	}*/
	
	public WebElement getAgent(){
		return driver.findElement(agent);
	}
	
	/*public WebElement getInventory(){
		return driver.findElement(inventory);
	}
	
	public WebElement getLive(){
		return driver.findElement(live);
	}
	
	public WebElement getKeys(){
		return driver.findElement(keys);
	}
	
	public WebElement getFinance(){
		return driver.findElement(finance);
	}
	
	public WebElement getHome(){
		return driver.findElement(trringohome);
	}
	
	public WebElement getOldTrringo(){
		return driver.findElement(oldtrringo);
	}
	
*/
}
