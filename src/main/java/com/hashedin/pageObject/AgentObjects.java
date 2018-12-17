package com.hashedin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgentObjects {
	
	public WebDriver driver;
	
	 By orders = By.xpath("//a[@id='active-link']");
	 By offlineorders = By.xpath("//a[@class='offline-nav-bar app-link']");
	 By feedback = By.xpath("//a[@class='app-link']");
	 By custNumber = By.xpath("//input[@id='landing-mobile']");
	 By orderID = By.xpath("//input[@id='landing-mobile']");
	 By search = By.xpath("//button[@id='phone-search']");
	 By refresh = By.xpath("//i[@class='fa fa-undo']");
	 
	 
	  
		public AgentObjects(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver =  driver;
		}

		public WebElement getOrders(){
		return driver.findElement(orders);
		}
		
		public WebElement getOrderId(){
			return driver.findElement(orderID);
			}
	 
		public WebElement getOfflineOrders(){
		return driver.findElement(offlineorders);
		}
		
		public WebElement getFeedback(){
			return driver.findElement(feedback);
		}
		
		
		public WebElement getSearch(){
			return driver.findElement(search);
		}
		
		public WebElement getRefresh(){
			return driver.findElement(refresh);
		}

		public WebElement getCustNumber() {
			// TODO Auto-generated method stub
			return driver.findElement(custNumber);
		}
	 
	 
}
