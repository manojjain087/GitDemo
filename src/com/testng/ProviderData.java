package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ProviderData 

{	WebDriver driver;
  @Test(dataProvider = "Getdata")
  public void Login(String un, String pwd) throws InterruptedException 
  {
	  
	  driver.findElement(By.id("i0116")).sendKeys(un);
	  driver.findElement(By.id("i0118")).sendKeys(pwd);
	  Thread.sleep(2000);
	  driver.findElement(By.id("idSIButton9")).click();
  }
  
  
  
  @AfterMethod
  public void afterMethod() 
  {
	  driver.findElement(By.id("i0116")).clear();
	  driver.findElement(By.id("i0118")).clear();
  }


  @DataProvider
  public Object[][] Getdata() 
  
  {
    Object [][] obj = new Object[3][2];
    obj[0][0]="XYZ";
    obj[0][1]="XYZ";
    
    obj[1][0]="ABC";
    obj[1][1]="ABC";
    
    obj[2][0]="PQR";
    obj[2][1]="PQR";
    
    
    return obj;
    }

  @BeforeTest
  public void beforeTest()
  
  {
	  
	  driver = new FirefoxDriver();
	  driver.get("http://www.live.com");
  }

  @AfterTest
  public void afterTest() 
  
  {
	  //driver.close();
  }

}
