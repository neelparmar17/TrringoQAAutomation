package com.hashedin.resources;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class loginPage extends BaseClass  {
	
	public WebDriver driver;
	
	
	
	
	@Test
	public WebDriver login() throws Exception{
		
		
		
		driver = openBrowser();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		return driver;
		
	}
				
	
	
	
	
	//prop = new Properties();
    //FileInputStream file = new FileInputStream("C:\\Users\\Hasher\\Automation\\Projects\\practiceProject\\src\\main\\java\\com\\hashedin\\resources\\data.properties");
//////System.out.println("1");
////prop.load(file);
//////String url = prop.getProperty("url");
//////System.out.println(url);
//////driver.get(url);
//
//driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("fgf");
//driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("hgh");
//driver.findElement(By.xpath("//input[@type='submit")).click();
//
	
	

}
