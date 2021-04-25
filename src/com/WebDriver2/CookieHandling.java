package com.WebDriver2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.manage().getCookies();
		
		
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie obj :cookiesList) 
		{
		    System.out.println("Cookie Domain :"+ obj.getDomain() );
		    System.out.println("Cookie Name :"+obj.getName() );
		    System.out.println("Cookie Expiry :"+obj.getExpiry() );
		    System.out.println("Cookie Value :"+obj.getValue() );
		}
		driver.manage().deleteAllCookies();
		Set<Cookie> cookiesList1 =  driver.manage().getCookies();
		for(Cookie obj1 :cookiesList1) 
		{
		    System.out.println("Cookie Domain :"+ obj1.getDomain() );
		    System.out.println("Cookie Name :"+obj1.getName() );
		    System.out.println("Cookie Expiry :"+obj1.getExpiry() );
		    System.out.println("Cookie Value :"+obj1.getValue() );
	}
		System.out.println("After deleting" );
}}
