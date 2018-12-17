package com.hashedin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceOrderObj {
	
	public WebDriver driver;
	
	 By enterImplement = By.xpath("//input[@id='implement-type']");
	 By impSearch = By.xpath("//button[@id='search-implement']");
	 By selectPrice = By.cssSelector("[data-implement-sku='101102200']"); 
			 //By.xpath("//ul[@id='std-impl-rates']//tbody//tr[2]//td[3]//button[0]");
	 By selectSKU = By.xpath("//tbody//tr[1]//td[3]//button[1]");
	 By farmarea = By.xpath("//input[@id='schedule-for-area']");
	 By opDuration = By.xpath("//input[@id='schedule-for-duration']");
	 By dateSelection = By.xpath("//label[contains(text(),'Tomorrow')]");
	 By hourSelection = By.xpath("//input[@id='schedule-time-hours']");
	 By minSelection = By.xpath("//input[@id='schedule-time-mins']");
	 By selectPM = By.xpath("//label[contains(text(),'PM')]");
	 By placeOrder = By.xpath("//button[@id='place-order-btn']");
	 By closeEnquiry = By.xpath("//button[@id='enquire-equipment-details-btn']");
	 By back = By.xpath("//span[contains(text(),'Back')]");
	 By addCoupon = By.xpath("//input[@id='coupon-code']");
	 By applyCoupon = By.xpath("//button[@id='apply-coupon-btn']");
	 By moveNextday = By.xpath("//label[contains(text(),'Yes')]");
	 By restrictTotoday = By.xpath("//label[contains(text(),'No')]");
	 By textverify = By.xpath("//span[@class='card-label green-text new-customer-message']");
	 By farmland = By.xpath("//select[@id='farmland-select']"); 
	 By nextAT = By.xpath("//div[@class='row margin-top-time']//div//label[@class='radio-button-label black-text']");
	 By exclprc = By.xpath("//p[@class='collapsible-header']");
	 By excSKU = By.xpath("//tbody//tr[1]//td[4]//button[1]");
	 By excopSKu = By.xpath("//ul[@id='exe-impl-rates']//tbody//tr[2]//td[3]//button[1]");
	
	 By perAcr = By.xpath("//ul[@id='std-price-modal-tab']//li[@value='PER_ACRE'][contains(text(),'Per Acre')]");
	 By perAcrExcl = By.xpath("//ul[@id='exe-price-modal-tab']//li[@value='PER_ACRE'][contains(text(),'Per Acre')]");
	 By acrstdSKU = By.xpath("//ul[@id='std-impl-rates']//tbody//tr[2]//td[5]//button[1]");
	 By acrwoSku = By.xpath("//tbody//tr[1]//td[6]//button[1]");
	
	 
	 
	 
	 
	 
	 
	 public PlaceOrderObj(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver =  driver;
		}
	 
	 public WebElement getverifyText(){
			return driver.findElement(textverify);
	 }
	 
	 public WebElement getImplementName(){
			return driver.findElement(enterImplement);
	 }
	 
	 public WebElement getfarmland(){
			return driver.findElement(farmland);
	 }
	 
	 public WebElement getNAT(){
	 return driver.findElement(nextAT);
	 }
	 
	 public WebElement getAcrPrc(){
	 return driver.findElement(perAcr);
	 }
	 
	 public WebElement getSearchImp(){
			return driver.findElement(impSearch);
	 }
	 
	 public WebElement getSeletSpec(){
			return driver.findElement(selectPrice);
	 }
	 
	 public WebElement getSeletSKU(){
			return driver.findElement(selectSKU);
	 }

	 public WebElement getOpArea(){
			return driver.findElement(farmarea);
	 }
	 
	 public WebElement getOpDuration(){
			return driver.findElement(opDuration);
	 }
	 
	 public WebElement getSelectPM(){
			return driver.findElement(selectPM);
	 }
	 
	 public WebElement getSelectDay(){
			return driver.findElement(dateSelection);
	 }
	 
	 public WebElement getHours(){
			return driver.findElement(hourSelection);
	 }

	 public WebElement getMin(){
			return driver.findElement(minSelection);
	 }
	 
	 public WebElement getPlaceOrder(){
			return driver.findElement(placeOrder);
	 }
	 
	 public WebElement getClsoeEnq(){
			return driver.findElement(closeEnquiry);
	 }
	 
	 public WebElement getBackToOrders(){
			return driver.findElement(back);
	 }

	 public WebElement getCoupon(){
			return driver.findElement(addCoupon);
	 }
	 
	 public WebElement getApplyCoupon(){
			return driver.findElement(applyCoupon);
	 }
	 
	 public WebElement getOrderNextDay(){
			return driver.findElement(moveNextday);
	 }
	 
	 public WebElement getOrderSameDay(){
			return driver.findElement(restrictTotoday);
	 }
	 
	 public WebElement getexclprc(){
			return driver.findElement(exclprc);
	 }
	 
	 public WebElement getexcSKU(){
			return driver.findElement(excSKU);
	 }
	 
	 public WebElement geteexcopSKu(){
			return driver.findElement(excopSKu);
	 }
	 
	 public WebElement getperAcr(){
			return driver.findElement(perAcr);
	 }
	 
	 public WebElement getperAcrExcl(){
			return driver.findElement(perAcrExcl);
	 }
	 
	 public WebElement getacrstdSKU(){
			return driver.findElement(acrstdSKU);
	 }
	 
	 public WebElement getacrwoSku(){
			return driver.findElement(acrwoSku);
	 }
	 
	
	 
	 
	 
	 
}
