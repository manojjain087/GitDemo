package com.webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getTitle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle()); //directly can print the title 
	//otherway
	String title = driver.getTitle();//printing using the variable.
	System.out.println("The Title is: "+title);
	driver.close();
	}

}
