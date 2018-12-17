package com.hashedin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrdersObject {

	public WebDriver driver;
	
	 By farmertab = By.id("//button[@id='FARMER']");
	 By suppliertab = By.xpath("//button[@id='SUPPLIER']");
	 By orderenquiry = By.xpath("//button[@type='submit']");
	 By edit = By.xpath("//a[@id='edit-farmer-link']");
	 By farmlands = By.xpath("//div[@class='collapsible-header col s12 active']");
	 By txt = By.xpath("//span[@class='card-title live-orders']");
	 By ordersearchtxt = By.xpath("//span[contains(text(),'Showing order details for Farmer.')]");
	 By supplierTab = By.xpath("//button[@id='SUPPLIER']");
	 By farmerTab = By.xpath("//button[@id='FARMER']");
	 By AssignOp = By.xpath("//button[@id='assign-operator-btn']");
	 By reschedule = By.xpath("//button[@id='request-new-time-order-btn']");
	 By cancel = By.xpath("//button[@id='cancel-order-btn']");
	 By orderStatusOpAss = By.xpath("//span[@class='col s10 right order-status']");
	 
	 By selectOp = By.xpath("//div[@id='assign-operator[110562]']");
	 By assignBtn = By.xpath("//div[@id='assign-operator[110562]']//button[@id='assign-operator']");
	 
	 By startOrder = By.xpath("//button[@value='110614'][contains(text(),'START ORDER')]"); 
	 By stopOrder = By.xpath("//button[@value='110614'][contains(text(),'STOP ORDER')]");
	 By reportBreakdown = By.xpath("//button[@class='btn modal-trigger order-breakdown-btn order-details-btn btn-gray']");
			 //("//button[@value='110614'][contains(text(),'REPORT BREAKDOWN']");
	 By tractorBreakdown = By.xpath("//label[@for='tractorBreakdown110614']");
	 By confrmBD = By.xpath("//div[@id='breakdown-order[110614]']//button[@id='report-breakdown']");
	 By ImpBreakdown = By.xpath("//label[@for='implementBreakdown110614']");
	 By cancelBD = By.xpath("//div[@id='breakdown-order[110614]']//button[@type='button'][contains(text(),'CANCEL')]");
	 By resumeOrder = By.xpath("//button[@id='resume-order']");
	 By orderId = By.xpath("//b[contains(text(),'110682')]");
	// By pauseOrder = By.xpath("");
	 By accept = By.xpath("//button[@value='110687'][contains(text(),'ACCEPT ORDER')]");
	 By acceptcnfrm = By.xpath("//div[@id='confirm-accept[110687]']//div[@class='modal-content center']//div//button[@id='accept-order']");
	 By reject = By.xpath("//button[@value='110685'][contains(text(),'REJECT ORDER')]");
	 By rejectreason = By.xpath("//div[@id='confirm-reject[110684]']//li[@id='busy_with_another_order']");
	 By rejectconfrm = By.xpath("//div[@id='confirm-reject[110684]']//button[@id='reject-order']");
	 
	 By alertyes = By.xpath("//div[@id='confirm-start[110614]']//div[@class='modal-content center']//div//button[@id='start-order']");
	 By alertno = By.xpath("//div[@id='confirm-start[110614]']//div[@class='modal-content center']//div//button[@type='button'][contains(text(),'No')]");
	 
	 By startTxt = By.xpath("//span[contains(text(),'Work Started')]");
	 By trctBDTxt = By.xpath("//span[contains(text(),'Tractor Breakdown')]");
	 By ResumeTxt = By.xpath("//span[contains(text(),'Work Restarted')]");
	 By impBDTxt = By.xpath("//span[contains(text(),'Implement Breakdown')]");
	 By stopTxt = By.xpath("//span[@class='col s10 right order-status']");
	 By acceptedTxt =By.xpath("//span[@class='col s10 right order-status']");
	 
	 
	 
	 
	 
	 
	 public OrdersObject(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver =  driver;
		}
	 
	        public WebElement getfarmer(){
			return driver.findElement(farmertab);
			}
		 
			public WebElement getSupplier(){
			return driver.findElement(suppliertab);
			}
			
			public WebElement getOrderId(){
			return driver.findElement(orderId);
			}
			
			public WebElement getacceptcnfrm(){
			return driver.findElement(acceptcnfrm);
			}
			
			public WebElement gettxt(){
			return driver.findElement(txt);
			}
			
			public WebElement getordersearchtxt(){
			return driver.findElement(ordersearchtxt);
			}
			
			public WebElement getNewEnquiry(){
				return driver.findElement(orderenquiry);
			}
			
			
			public WebElement getEdit(){
				return driver.findElement(edit);
			}
			
			public WebElement getFarmlands(){
				return driver.findElement(farmlands);
			}
			
			public WebElement getFarmerTab(){
				return driver.findElement(farmerTab);
			}
			
			public WebElement getsupplierTab(){
				return driver.findElement(supplierTab);
			}
			
			public WebElement getAssignOp(){
			return driver.findElement(AssignOp);
			}
			
			public WebElement getreschedule(){
			return driver.findElement(reschedule);
			}
			
			public WebElement getorderCancel(){
			return driver.findElement(cancel);
			}
			
			public WebElement getselectOp(){
			return driver.findElement(selectOp);
			}
			
			public WebElement getassignBtn(){
			return driver.findElement(assignBtn);
			}
			
			public WebElement getopStatus(){
			return driver.findElement(orderStatusOpAss);
			}
			
			public WebElement getStartOrder(){
			return driver.findElement(startOrder);
			}
			
			public WebElement getstopOrder(){
				return driver.findElement(stopOrder);
				}
				
				public WebElement getreportBreakdown(){
				return driver.findElement(reportBreakdown);
				}
				
				public WebElement gettractorBreakdown(){
				return driver.findElement(tractorBreakdown);
				}
				
				public WebElement getconfrmBD(){
				return driver.findElement(confrmBD);
				}
					
				public WebElement getImpBreakdown(){
				return driver.findElement(ImpBreakdown);
				}
					
				public WebElement getcancelBD(){
				return driver.findElement(cancelBD);
				}
				
				public WebElement getresumeOrder(){
				return driver.findElement(resumeOrder);
				}
					
				public WebElement getaccept(){
				return driver.findElement(accept);
				}
						
				public WebElement getreject(){
				return driver.findElement(reject);
				}
				
				public WebElement getrejectreason(){
				return driver.findElement(rejectreason);
				}
				
				public WebElement getrejectconfrm(){
				return driver.findElement(rejectconfrm);
				}
									
				public WebElement getstartTxt(){
				return driver.findElement(startTxt);
				}
				
				public WebElement getalertyes(){
				return driver.findElement(alertyes);
				}
						
				public WebElement getalertno(){
				return driver.findElement(alertno);
				}
				
				public WebElement gettrctBDTxt(){
				return driver.findElement(trctBDTxt);
				}
					
				public WebElement getResumeTxt(){
				return driver.findElement(ResumeTxt);
				}
							
				public WebElement getimpBDTxt(){
				return driver.findElement(impBDTxt);
				}
					
				public WebElement getStopTxt(){
				return driver.findElement(stopTxt);
				}
					
				public WebElement getacceptedTxt(){
				return driver.findElement(acceptedTxt);
				}

				
}
