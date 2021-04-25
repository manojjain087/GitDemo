package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByPartialLinkText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	//driver.findElement(By.partialLinkText("Adver")).click();
	//System.out.println(driver.getTitle());
	driver.findElement(By.partialLinkText("ness")).click();//The Text inside the link text is the link text present on webpage. It search based on the first come first match basis.its selenium locator 
	//used for partially searching the link for which we have only few words details.
	System.out.println(driver.getTitle());
	driver.close();
	

	}

}
