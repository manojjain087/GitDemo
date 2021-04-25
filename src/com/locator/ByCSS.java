package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByCSS {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.live.com");
		driver.get("http://www.google.com");
		//driver.findElement(By.cssSelector("input[id='idSIButton9']")).click();//For cssSelecotor : its another locator of of webdriver and s=in syntax we enclosed first input keyword then in square bracket privide any unique id with its unique value in single quotes. 
		//driver.findElement(By.cssSelector("input#idSIButton9")).click();//For cssSelecotor : its another locator of of webdriver and s=in syntax we enclosed first input keyword then in square bracket privide any unique id with its unique value in single quotes.
		
		//driver.findElement(By.cssSelector("a#gb_70")).click();//Here a is the tagname and # sign is used for id value kind of shortcut.
		//driver.findElement(By.cssSelector("a.gb_P")).click();//Here . is used to represent the class name.
		
		
		//driver.findElement(By.cssSelector("input[id*=Button]")).click();
		//driver.findElement(By.cssSelector("input[id*=Button]")).click();
		//driver.findElement(By.cssSelector("input[id^=idSI]")).click();
		//driver.findElement(By.cssSelector("input[id$=on9]")).click();
		//driver.findElement(By.cssSelector("input[id$=on9] [class='btn btn-block btn-primary btn-image btn-image-svg']")).click();
		
		//driver.findElement(By.cssSelector("input[class^=btn]")).click();
		driver.findElement(By.cssSelector("a[id*=gb_7]")).click();
		
		//driver.findElement(By.cssSelector("input[id='idSIButton9'][class='btn btn-block btn-primary btn-image btn-image-svg']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.cssSelector("input[jsaction='sf.chk']")).click();//For cssSelecotor : its another locator of of webdriver and s=in syntax we enclosed first input keyword then in square bracket privide any unique id with its unique value in single quotes. 
		System.out.println(driver.getTitle());
		driver.close();*/
		
		

	}

}
