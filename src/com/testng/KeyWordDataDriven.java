package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class KeyWordDataDriven

{	
	Properties p;
	File f,file;
	FileOutputStream fos;
	FileInputStream fis,fin;
	HSSFWorkbook wb;
	String shnm;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	WebDriver driver;
	int rowCount, colCount, row, col;
	static int i =1;
	String exp = "Please enter your phone number or your email address in the format someone@example.com.";
	String act = null;
	
	

  @Test(dataProvider = "getData")
  public void LiveLogin(String un, String pwd) throws IOException 
  {		
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get(p.getProperty("url"));
	  driver.findElement(By.id(p.getProperty("txt_un_id"))).sendKeys(un);
	  driver.findElement(By.id(p.getProperty("txt_pw_id"))).sendKeys(pwd);
	  driver.findElement(By.id(p.getProperty("bt_signin_id"))).click();
		
		
		/*driver.findElement(By.id("i0116")).sendKeys(un);
		driver.findElement(By.id("i0118")).sendKeys(pwd);
		driver.findElement(By.id("idSIButton9")).click();*/
		
		 act = driver.findElement(By.id("usernameError")).getText();
		System.out.println("Actual is"+act);
		fos= new FileOutputStream(f);
		rw = sh.getRow(i);
		cl = rw.createCell(2);
		
		HSSFCellStyle style = wb.createCellStyle();
		HSSFFont ifPass = wb.createFont();
		ifPass.setBold(true);
		ifPass.setColor(HSSFColor.GREEN.index);
		
		
		HSSFFont ifFail = wb.createFont();
		ifFail.setBold(true);
		ifFail.setColor(HSSFColor.RED.index);
		
		
		if(act.equalsIgnoreCase(exp))
			{
						
				cl.setCellValue("Pass");
				style.setFont(ifPass);
				cl.setCellStyle(style);		
			}
		else
		{
			
			cl.setCellValue("Fail");
			style.setFont(ifFail);
			cl.setCellStyle(style);		
		}
	  i++;
	  wb.write(fos);
	  fos.close();
	  }
	
	
  @AfterMethod
  public void afterMethod()
  {
	  
	  driver.findElement(By.id("i0116")).clear();
	  driver.findElement(By.id("i0118")).clear();
  }
  
  
  
	public void getRowCount(){
		
		rowCount = sh.getPhysicalNumberOfRows();
	}
	
	public void getColCount(){
		colCount = sh.getRow(0).getLastCellNum();
	}
	
	
	 @DataProvider
	  public String[][] getData() throws IOException 
	  {
		  getRowCount();
		  getColCount();
		  

		  
		  
		  String [][] data = new String[rowCount-1][colCount-1];
		   
		   for(row=0;row<rowCount-1;row++)
		   {
			   
			   rw=sh.getRow(row+1);
			   for(col=0;col<colCount-1;col++)
			   {
				   
				   cl=rw.getCell(col);
				   data[row][col]=cl.getStringCellValue();
			   }
		   }
		    
		    return data;
	    }
	  
	  
  
  @BeforeTest
  public void beforeTest() throws IOException 
  {
	  
	  file = new File("Z:\\Selenium_Workspace\\Webdriver\\src\\com\\testng\\keyword.properties");
	  fin = new FileInputStream(file);
	  p = new Properties();
	  p.load(fin);
	  driver = new FirefoxDriver();
	  //driver.get("http://www.live.com");
	  driver.manage().window().maximize();
	  f= new File("Z:\\Excel\\LiveDDT.xls"); 
		fis = new FileInputStream(f);
		wb = new HSSFWorkbook(fis);
		shnm = wb.getSheetName(0);
		sh = wb.getSheet(shnm);
  }

  @AfterTest
  public void afterTest() throws IOException 
  
  
  {
	  driver.close();
  }
  
  

}

