package com.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File is java class. ((TakesScreenshot)driver)--Here we are typecasting the TakesScreenshot to driver.getScreenshotAs is not the method of
		// of TakesScreenshot.OutputType.FILE we are providing the type.
		FileUtils.copyFile(scrFile, new File("D:\\GooglehomePage.png"));
		//Another java class FileUtils
		//copyFile(scrFile, new File("D:\\GooglehomePage.png")) here we are creating new file as well as saving it to D driver
		System.out.println("DOne");
		driver.close();
		
	}

}
