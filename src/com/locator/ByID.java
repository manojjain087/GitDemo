package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByID {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.live.com");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("idSIButton9")).click();
		System.out.println(driver.getTitle());
		
		

	}

}
