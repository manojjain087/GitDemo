package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LiveParameters 

{  
	Properties p;
	File file;
	FileInputStream fin;
	WebDriver driver;
  @Test
  public void LiveParam() throws IOException 
  
  
  {
	  driver.get(p.getProperty("url"));
	  driver.findElement(By.id(p.getProperty("txt_un_id"))).sendKeys("India");
	  driver.findElement(By.id(p.getProperty("txt_pw_id"))).sendKeys("India");
	  driver.findElement(By.id(p.getProperty("bt_signin_id"))).click();
	 
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException 
  
  {
	  
	  
	 
	  file = new File("Z:\\Selenium_Workspace\\Webdriver\\src\\com\\testng\\keyword.properties");
	  fin = new FileInputStream(file);
	  p = new Properties();
	  p.load(fin);
	  driver = new FirefoxDriver();
	  //driver.get("http://www.live.com");
	  driver.manage().window().maximize();
	
  }

  @AfterTest
  public void afterTest() 
  
  {
	  driver.close();
  }

}
