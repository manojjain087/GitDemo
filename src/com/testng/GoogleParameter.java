package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GoogleParameter 
{
	WebDriver driver;
	@Parameters({"id"})
  @Test
  public void f(String id) 
  {
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		  
		  driver.findElement(By.className("lsb")).click();
	  
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
	  
	  //driver.close();
  }

}
