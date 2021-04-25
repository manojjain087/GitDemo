package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		WebElement w;
		w = driver.findElement(By.xpath("//input[@value='Cheese']"));
		System.out.println("Before Click operation ");
		System.out.println("Cheese Checkbox Displayed ?"+w.isDisplayed());
		System.out.println("Cheese Checkbox Enabled ?"+w.isEnabled());
		System.out.println("Cheese Checkbox Selected ?"+w.isSelected());
		
		w.click();
		System.out.println("After Click operation ");
		System.out.println("Cheese Checkbox Displayed ?"+w.isDisplayed());
		System.out.println("Cheese Checkbox Enabled ?"+w.isEnabled());
		System.out.println("Cheese Checkbox Selected ?"+w.isSelected());
		

	}

}
