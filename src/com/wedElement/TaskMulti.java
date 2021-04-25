package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskMulti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Z:/MultiSelect.html");
		WebElement web = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s = new Select(web);
		s.selectByIndex(0);
		s.selectByValue("audi");
		s.selectByVisibleText("Saab");
		
		

		for (int i =0;i<s.getAllSelectedOptions().size();i++){
			System.out.println((i+1)+". "+s.getAllSelectedOptions().get(i).getText());
		}
		driver.close();
	}

}
