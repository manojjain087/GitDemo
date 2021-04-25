package com.WebDriver2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.rediff.com");
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Alert a = driver.switchTo().alert();
		a.accept();//is for accept the alert --OK
		a.dismiss();//is for cancel button.
		driver.switchTo().defaultContent();//to move back to main window
		
	}

}
