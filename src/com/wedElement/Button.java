package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button {

	/**
	 * @param args
	 */
	//program to check if we don't enter the credentials then not moved to next page
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.live.com");
		String t1 =driver.getTitle();
		System.out.println("Title One is :"+t1);
		driver.findElement(By.xpath(".//*[@id='idSIButton9']")).click();
		driver.getTitle();
		String t2 = driver.getTitle();
		System.out.println("Title One is :"+t2);
		
		if (t1.contentEquals(t2))
		{
			
			System.out.println("Status :Pass");
			
		}
		else
		{
			
			System.out.println("Status :Fail");
		}
	}

}
