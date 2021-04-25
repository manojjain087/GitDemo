package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;



public class LiveParameter 
{
	WebDriver driver;
  @Parameters({"un","pwd"})
  @Test
  public void f(String un, String pwd) 
  {
	  driver.findElement(By.id("i0116")).sendKeys("un");
	  driver.findElement(By.id("i0118")).sendKeys("pwd");
	  driver.findElement(By.id("idSIButton9")).click();
	  String act = driver.findElement(By.id("usernameError")).getText();
		 String exp1 = "Please enter your phone number or your email address in the format someone@example.com.";
		 
		 if(act.equals(exp1))
				{
					
					System.out.println("Match Found:"+exp1);
					
				}
	  
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
