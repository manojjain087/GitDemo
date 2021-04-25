package com.wedElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.id("Email")).sendKeys("manoj.mi3@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		/*driver.findElement(By.cssSelector("input[id='signIn']")).sendKeys("codebank");*/
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("codebank");
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//div[contains(text(),'COMPOSE')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//div[contains(text(),'To')]")).sendKeys("manojjain005@gmail.com");
		//driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("manojjain005@gmail.com");
		driver.findElement(By.xpath(".//div[contains(text(),'Subject')]")).sendKeys("Do Not Reply : Selenium Auto Generated Mail");
		//driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Do Not Reply : Selenium Auto Generated Mail");
		
		driver.findElement(By.xpath(".//*[@role='textbox']")).sendKeys("Hi Manoj ..Now you send the mail");
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
		//driver.findElement(By.cssSelector("div[@class='J-J5-Ji']")).click();
		//driver.findElement(By.cssSelector("div[@class='J-J5-Ji']")).click();
		//driver.findElement(By.xpath(".//div[@class='J-J5-Ji']//div/role=button")).click();
		//driver.findElement(By.xpath("//div[@class='J-J5-Ji']")).click();
		
		
		
		//driver.findElement(By.xpath(":pr")).click();
		//driver.findElement(By.xpath(":px")).click();
		
		//driver.findElement(By.id(":ns")).click();
		//driver.findElement(By.id(":mz")).click();
		driver.findElement(By.xpath(".//div[contains(text(),'Send')]")).click();

		
		 //Thread.sleep(5000);

	        //driver.findElement(By.xpath("//div[@class='Ar Au']//div"));
	    /*    */
	
		/*driver.findElement(By.xpath(".//*[@id=':q3']]")).sendKeys("Hi Manoj ..Now you send the mail");
		
		driver.findElement(By.xpath(".//*[@id=':o7']")).sendKeys("Do Not Reply : Selenium Auto Generated Mail");
		
		driver.findElement(By.xpath(".//*[@id=':nx']")).click();
	
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
		
		
		//driver.findElement(By.cssSelector("input[id='signIn']")).sendKeys("codebank");
		//driver.findElement(By.cssSelector("input[id='Passwd'][placeholder='Password']")).sendKeys("codebank");
		*/
	}

}
