package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RowColumn 

{
	
	WebDriver driver;
	WebElement ls;
  @Test
  public void f() 
  
  {
	 
	  
  }
  
  @Test
  public void column(){
  java.util.List<WebElement> ls1 =driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	System.out.println(ls1.size());

  }
  
  @Test
  public void Row()
  {
	  java.util.List<WebElement> ls2 =driver.findElements(By.xpath("html/body/div[1]/div[5]/table/thead/tr/th"));
		System.out.println(ls2.size());
	  
  }
  
  @BeforeTest
  public void beforeTest() 
  
  {
	  driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/monthly?src=all_pg");
		driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() 
  {
	 
	 
			driver.close();
	
  }

}
