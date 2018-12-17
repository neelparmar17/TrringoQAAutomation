package com.hashedin.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver openBrowser() throws Exception{
		
		prop = new Properties();
		FileInputStream file = new FileInputStream("/home//neel//Downloads//practiceProject//src//main//java//com//hashedin//resources//data.properties");
		prop.load(file);
		System.out.println(file);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/usr//bin//chromedriver");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")){
			driver = new ChromeDriver();
		}
		else{
			
//			System.setProperty("webdriver.ie.driver", "C://Users//Hasher//Automation//IEDriverServer.exe");
//			driver = new InternetExplorerDriver();
						
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("/home/neel/Downloads/practiceProject//Screenshots//"+result+" screenshot.png"));
		
	}
//	public void login(WebDriver driver) throws IOException{
////        prop = new Properties();
////        FileInputStream file = new FileInputStream("C:\\Users\\Hasher\\Automation\\Projects\\practiceProject\\src\\main\\java\\com\\hashedin\\resources\\data.properties");
//////		System.out.println("1");
////        prop.load(file);
//////		String url = prop.getProperty("url");
//////		System.out.println(url);
//////		driver.get(url);
//	
//		driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("fgf");
//		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("hgh");
//		driver.findElement(By.xpath("//input[@type='submit")).click();
//		
//	}


	
     public void getExpWaitTime(int seconds, String xpath){

	   WebDriverWait wait = new WebDriverWait(driver,seconds);
	   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    	 System.out.println(element.toString());
    	 /*if (name == "cssSelector");
    	 {
	   WebDriverWait wait = new WebDriverWait(driver,seconds);
	   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(xpath)));
    	 }
    */ }

     public void getImpWaitTime(int sec){
    	 driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    	 
     }
     
     public void getWait(int ms) throws Exception{
    	 Thread.sleep(ms);
     }
	
}
