package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/monthly?src=all_pg");
		driver.manage().window().maximize();
		System.out.print(driver.getTitle());
		WebElement we =driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]/a"));
		we.click();
		System.out.print(driver.getTitle());
		//.//*[@id='leftcontainer']/table/thead/tr/th
	}
	
}
