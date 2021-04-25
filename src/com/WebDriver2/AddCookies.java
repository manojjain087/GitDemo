package com.WebDriver2;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddCookies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Cookie coo = new Cookie("Username","Manoj");
		driver.manage().addCookie(coo);
		 System.out.println("Cookie Domain :"+ coo.getDomain() );
		 System.out.println("Cookie Name :"+coo.getName() );
		    System.out.println("Cookie Expiry :"+coo.getExpiry() );
		    System.out.println("Cookie Value :"+coo.getValue() );
		    driver.close();
	}

}
