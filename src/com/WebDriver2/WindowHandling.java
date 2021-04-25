package com.WebDriver2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WindowHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jobserve.com/gb/en/Job-Search/");
		driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='SPBApplyBtn']")).click();
		
		Set<String> wh = driver.getWindowHandles();
		
		Iterator<String> i= wh.iterator();
		String mw = i.next();
		String nw = i.next();
		driver.switchTo().window(nw);
		System.out.println("Title of new window :"+driver.getTitle());
		driver.switchTo().window(mw);
		System.out.println("Title of main window :"+driver.getTitle());
		driver.quit();
		
		

	}

}
