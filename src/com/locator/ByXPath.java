package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByXPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("html/body/div/div[3]/div[1]/div/div/div/div[2]/div[3]/div/a")).click();
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
