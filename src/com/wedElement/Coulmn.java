package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Coulmn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/monthly?src=all_pg");
		driver.manage().window().maximize();
		// to get the count of column in table
		// java.util.List<WebElement> ls =driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		 java.util.List<WebElement> ls =driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[5]"));
		System.out.println(ls.size());
		/*for (WebElement we:ls)
		{
			System.out.println(we.getText());
			
		}*/
		
		

	}

}
