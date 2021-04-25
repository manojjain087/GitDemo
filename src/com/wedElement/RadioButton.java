package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		WebElement web = driver.findElement(By.xpath("//input[@value='Water']"));
		
		System.out.println("Before Click operation ");
		System.out.println("Cheese Checkbox Displayed ?"+web.isDisplayed());
		System.out.println("Cheese Checkbox Enabled ?"+web.isEnabled());
		System.out.println("Cheese Checkbox Selected ?"+web.isSelected());
		
		web.click();
		System.out.println("After Click operation ");
		System.out.println("Cheese Checkbox Displayed ?"+web.isDisplayed());
		System.out.println("Cheese Checkbox Enabled ?"+web.isEnabled());
		System.out.println("Cheese Checkbox Selected ?"+web.isSelected());
		

	}

}
