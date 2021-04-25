package com.package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {


	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();///here we are implementing the selenium webdriver interface to implement the Firfoxdriver class.It is the example of dynamic polymorphism  
		 //The purpose is to not directly creating the object of class file is security.Here selenium people don't want us to know how they implement the methods..they only show the methods to use it.
		driver.manage().window().maximize();//through Driver object we are calling the webdriver methods. 
		driver.manage().wait(1);
		driver.close();
		
		

	}

}
