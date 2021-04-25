package com.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicMenu {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.istqb.in/");
		WebElement we = driver.findElement(By.xpath(".//*[@id='menu640']/span"));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		
		 java.util.List<WebElement> ls =driver.findElements(By.xpath(".//*[@id='ja-megamenu']/ul/li[3]/div/div/div/div/ul/li"));
		 //java.util.List<WebElement> ls =driver.findElements(By.xpath("//div[@class='childcontent-inner-wrap']/div/div/ul/li/a"));
			System.out.println(ls.size());
			for(int i=0;i < ls.size(); i++)
			{
				Thread.sleep(500);
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(ls.get(i).getText());
				
				
			}
		
		
	}

}
