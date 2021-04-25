package com.WebDriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterNaukri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://my.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div/form/div[2]/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='fname']")).sendKeys("Manoj Jain");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Manoj.mi3@gmail.com");
		driver.findElement(By.xpath(".//*[@id='basicDetailForm']/div[3]/div[1]/div/input")).sendKeys("Manoj_123");
		driver.findElement(By.xpath(".//*[@id='basicDetailForm']/div[4]/div[1]/div/input[2]")).sendKeys("9766674785");
		
		driver.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input")).sendKeys("2");
		
		driver.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys("9");
		
		
		
		
	
		
		

	}

}
