package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GoogleLinksGroup 


{
	
	WebDriver driver;
	String et = "Google";
	String at = null;
  @Test(priority=1,groups = "Top")
  public void Gmail() 
  {
	  driver.findElement(By.linkText("Gmail")).click();
	  
  }
  @Test(priority=2,groups = "Top")
  public void Images() 
  {
	  driver.findElement(By.linkText("Images")).click();
	  
  }
  
  
  @Test(priority=3,groups = "Bottom")
  public void Advertising() 
  {
	  driver.findElement(By.linkText("Advertising")).click();
	  
  }
  
  @Test(priority=4,groups = "Bottom")
  public void Business() 
  {
	  driver.findElement(By.linkText("Business")).click();
	  
  }
  
  
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() 
  
  {
	  at = driver.getTitle();
	  Assert.assertEquals(at, et);
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() 
  {
	
	  driver.navigate().back();
	  
  }

  @BeforeTest(alwaysRun=true)
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() 
  {
	  driver.quit();
  }

}
