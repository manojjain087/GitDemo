package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Software Testing"); //sendkeys is another method of selenium which used for providing the values to a textbox.we need to give it double quotes
		driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
	}

}
