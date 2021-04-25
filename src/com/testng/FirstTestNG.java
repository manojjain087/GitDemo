package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTestNG 
{
WebDriver driver;
@Test
  public void get() 
  
  
  {
	 
	  driver.get("http://www.google.com");
	  System.out.println(driver.getTitle());
  }
  @BeforeTest
  public void launch() 
  {
	  driver = new FirefoxDriver();
			driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
