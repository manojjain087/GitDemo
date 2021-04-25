package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	
	
	WebElement Drag= driver.findElement(By.id("draggable"));
	WebElement Drop= driver.findElement(By.id("droppable"));
	Actions act = new Actions(driver);
	act.dragAndDrop(Drag, Drop).perform();
	
	
	}

}
