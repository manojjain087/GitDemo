package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskComunFind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/monthly?src=all_pg");
		driver.manage().window().maximize();
 
		java.util.List<WebElement> ls =driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		 
		System.out.println(ls.size());
		
		String exp = "India Infraspace";
		String act= null;
		for(int i=0;i < ls.size(); i++)
		{
			act = ls.get(i).getText();
		
			
			if(act.equalsIgnoreCase(exp))
			{
				
				System.out.println("Match Found:"+exp+" At Position :"+(i+1));
				System.out.println();
				break;
			}
			
			if(i>=ls.size())
			{
				System.out.println("Match Not Found");
				
			}
			
			
		}

	}

}
