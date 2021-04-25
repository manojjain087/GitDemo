package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TagNameElement {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement we = driver.findElement(By.xpath(".//*[@id='viewport']"));
		
		 java.util.List<WebElement> ls =driver.findElements(By.tagName("a"));
		 //java.util.List<WebElement> ls =driver.findElements(By.xpath("//div[@class='childcontent-inner-wrap']/div/div/ul/li/a"));
			System.out.println(ls.size());
			for(int i=0;i < ls.size(); i++)
			{
				Thread.sleep(1000);
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//System.out.println(ls.get(i).getText());
				System.out.println((i+1)+"."+ls.get(i).getText());
				
			

	}

	}
}
