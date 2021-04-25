package com.wedElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RowColumn {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/monthly?src=all_pg");
		driver.manage().window().maximize();
		// to get the count of column in table
		 java.util.List<WebElement> ls =driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println(ls.size());
		/*for (WebElement we:ls)
		{
			System.out.println(we.getText());
			
		}*/
		
		
		
		for(int i=0;i < ls.size(); i++)
		{
			System.out.print(ls.get(i).getText());
			
		}
	}

}
