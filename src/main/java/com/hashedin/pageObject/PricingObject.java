package com.hashedin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PricingObject {
	
	public WebDriver driver;
	
	By taluka = By.xpath("//*[@id='search-by-taluka-label']");
	By village = By.xpath("//*[@id='search-by-village-label']");
	By hub = By.xpath("/html/body/main/div/div/div[1]/form/div[1]/div/div/div/div[2]/label[3]");
	By pc2c = By.xpath("/html/body/main/div/div/div[1]/form/div[1]/div/div/div/div[2]/label[4]");
	By c2c = By.xpath("/html/body/main/div/div/div[1]/form/div[1]/div/div/div/div[2]/label[5]");
	By talukaSearch = By.xpath("//*[@id='all-talukas']");
	By villageSearch = By.xpath("//*[@id='all-villages']");
	By hubSearch = By.xpath("//*[@id='all-hubs']");
	By pc2cSearch = By.xpath("//*[@id='all-pc2c']");
	By c2cSearch = By.xpath("//*[@id='all-c2c']");
	By implementSearch = By.xpath("//*[@id='all-implements']");
	By searchButton = By.xpath("//*[@id='search-pricing']");
	By hubDropDown = By.xpath("//*[@id='search-by-hub-autocomplete']/li");
	By implementSpecList = By.xpath("//*[@id='1']");
	By standardeditButton = By.xpath("//*[@id='swipe-pricing-8-current-1']/div/div[2]/div/table/tbody/tr[2]/td[1]/a[1]");
	By datepicker = By.xpath("//*[@id='effective-from-date']");
	By todayDate = By.xpath("//*[@id='effective-from-date_root']/div/div/div/div/div[2]/div[2]/button[1]");
	By OKButton = By.xpath("//*[@id='effective-from-date_root']/div/div/div/div/div[2]/div[2]/button[3]");
	By publishButton = By.xpath("//*[@id='publish-new-prices']");
	By perAcreStandardPrice = By.xpath("//*[@id='swipe-pricing-8-current-1']/div/div[2]/div/table/tbody/tr[2]/td[1]/input[1]");
	By deleteButton = By.xpath("//*[@id='swipe-pricing-8-current-1']/div/div[2]/div/table/tbody/tr[2]/td[1]/a[2]");
	
	
	public PricingObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getTalukaButton() {
		return driver.findElement(taluka);
	}
	
	public WebElement getVillageButton() {
		return driver.findElement(village);
	}
	
	public WebElement getHubButton() {
		return driver.findElement(hub);
	}
	
	public WebElement getPC2CButton() {
		return driver.findElement(pc2c);
	}
	
	public WebElement getC2CButton() {
		return driver.findElement(c2c);
	}
	
	public WebElement getTalukaSearch() {
		return driver.findElement(talukaSearch);
	}
	
	public WebElement getVillageSearch() {
		return driver.findElement(villageSearch);
	}
	
	public WebElement getHubSearch() {
		return driver.findElement(hubSearch);
	}
	
	public WebElement getPC2CSearch() {
		return driver.findElement(pc2cSearch);
	}
	
	public WebElement getC2CSearch() {
		return driver.findElement(c2cSearch);
	}
	
	public WebElement getImplementSearch() {
		return driver.findElement(implementSearch);
	}
	
	public WebElement getSearchButton() {
		return driver.findElement(searchButton);
	}
	
	public WebElement getHubDropDown() {
		return driver.findElement(hubDropDown);
	}
	
	public WebElement getImplementSpecList() {
		return driver.findElement(implementSpecList);
	}
	
	public WebElement getEditButton() {
		return driver.findElement(standardeditButton);
	}
	
	public WebElement getDatePicker() {
		return driver.findElement(datepicker);
	}
	
	public WebElement getDate() {
		return driver.findElement(todayDate);
	}
	
	public WebElement getOkButton() {
		return driver.findElement(OKButton);
	}
	
	public WebElement getPublishButton() {
		return driver.findElement(publishButton);
	}
	
	public WebElement getPerAcreStandard() {
		return driver.findElement(perAcreStandardPrice);
	}
	
	public WebElement getDeleteButton() {
		return driver.findElement(deleteButton);
	}
	
}
