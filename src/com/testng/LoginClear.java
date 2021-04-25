package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginClear 
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  
  }
  
  @Test
  public void EnterCredential() 
  {
	 driver.findElement(By.id("i0116")).sendKeys("ABC");
	  driver.findElement(By.id("i0118")).sendKeys("ABC"); 
  }
  
  @Test
  public void EnterCredential2() 
  {
	 driver.findElement(By.id("i0116")).sendKeys("XYZ");
	  driver.findElement(By.id("i0118")).sendKeys("XYZ"); 
  }
  
  @Test
  public void EnterCredential3() 
  {  
	 driver.findElement(By.id("i0116")).sendKeys("PQR");
	  driver.findElement(By.id("i0118")).sendKeys("PQR");
	  driver.findElement(By.id("idSIButton9")).click();
  }
  
  @Test
  public void ErrorHandling() 
  {
	  
	  String act = driver.findElement(By.id("usernameError")).getText();
	 String exp1 = "Please enter your phone number or your email address in the format someone@example.com.";
	 
	 if(act.equals(exp1))
			{
				
				System.out.println("Match Found:"+exp1);
				
			}
			
			
				
			
	 
  } 
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	 
	  driver.findElement(By.id("i0116")).clear();
	  driver.findElement(By.id("i0118")).clear();
  }

  @AfterMethod
  public void afterMethod() 
  {
	 
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
	   
	  driver.close();
  }

}
