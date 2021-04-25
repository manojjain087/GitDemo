package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GoogleLinks 


{
	
	WebDriver driver;
  @Test
  public void Gmail() 
  
  {
	  driver.findElement(By.linkText("Gmail")).click();
	  
  }
  
  @Test
  public void Link() 
  
  {
	  driver.findElement(By.partialLinkText("Images")).click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  
	  System.out.println(driver.getTitle());
  }
  

  @AfterMethod
  public void afterMethod() 
  
  {
	  System.out.println(driver.getTitle());
	  driver.navigate().back();
	  
  }
 

  @BeforeTest
  public void beforeTest()
  {
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  
  }

  @AfterTest
  public void afterTest()
   {
	  
	  driver.close();
  }
      

}
