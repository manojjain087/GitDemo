package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Priority

{
	
  @Test
  public void f() {
  }
  
  @Test(priority = 1)
  public void Test1()
  {
	  System.out.println("One");
  }
  
  @Test(priority = 3)
  public void Test2()
  {
	  System.out.println("Two");
  }
  
  @Test(priority = 2)
  public void Test3()
  {
	  System.out.println("Three");
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
