package com.webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class LaunchHTMLU {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		WebDriver driver=new HtmlUnitDriver();
		System.out.println("HTML Unit Driver");
		driver.close();

	}

}
