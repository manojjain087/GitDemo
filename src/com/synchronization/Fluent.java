package com.synchronization;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Software Testing");
		new FluentWait<WebDriver>(driver)
		.withTimeout(20, TimeUnit.SECONDS)
		.pollingEvery(10,TimeUnit.MILLISECONDS)
		.ignoring(NoSuchElementException.class)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sblsbb']/button"))).click();
	}

}
