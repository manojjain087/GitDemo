package com.wedElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CoumnName {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/monthly?src=all_pg");
		driver.manage().window().maximize();

		
		
		
		List<WebElement> columns=driver.findElements(By.tagName("td"));
		
		for(int i=0;i<columns.size();i++)
		
			{
		
			List<WebElement> c=columns.get(i).findElements(By.tagName("th"));
		
			System.out.println("Name of columns are:"+columns.get(i).getText());
			
		/*for(int j=0;j<columns.size();j++)
			
				{
			
				System.out.println(columns.get(j).getText());
			
				}*/
			
				}}
}
