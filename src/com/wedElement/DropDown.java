package com.wedElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
		WebElement web = driver.findElement(By.xpath("//select[@size='1']"));
		Select s = new Select(web);
		//s.selectByIndex(2);
		//s.selectByValue("Cheese");
		s.selectByVisibleText("Cheese");
		System.out.println(s.getFirstSelectedOption().getText());
		
		/*System.out.println("Before Click operation ");
		/*System.out.println("Cheese Checkbox Displayed ?"+web.isDisplayed());
		System.out.println("Cheese Checkbox Enabled ?"+web.isEnabled());
		System.out.println("Cheese Checkbox Selected ?"+web.isSelected());*/
		
		/*web.click();
		System.out.println("After Click operation ");
		WebElement web1 = driver.findElement(By.xpath("//option[@value='Butter']"));
		web1.click();
		
		System.out.println("Dropdown Selected ?"+web1.isSelected());
		WebElement web2 = driver.findElement(By.xpath("//option[@value='Cheese']"));
		web2.click();
		
		System.out.println("Dropdown Selected ?"+web2.isSelected());
		
		WebElement web3 = driver.findElement(By.xpath("//option[@value='Milk']"));
		web3.click();
		
		System.out.println("Dropdown Selected ?"+web3.isSelected());*/
		
		
	
		
	}

}
