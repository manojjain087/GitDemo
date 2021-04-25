package com.testng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExcelDataProvider 

{
	File f;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell c1;
	static int row=0;
	
	//WebDriver driver;
	
	
	
	
  @Test(dataProvider = "GetData")
  public void WritetoExcel(String name, String com,String loc)
  {
	  rw = sh.createRow(row);
	  c1 = rw.createCell(0);
	  c1.setCellValue(name);
	  c1=rw.createCell(1);
	  c1.setCellValue(com);
	  c1=rw.createCell(2);
	  c1.setCellValue(loc);
	  row++;
	
	 
  }
 


  @DataProvider
  public Object[][] GetData() throws IOException 
  {
	  

	  
	  
	  Object [][] obj = new Object[3][3];
	    obj[0][0]="XYZ";
	    obj[0][1]="XYZ";
	    obj[0][2]="XYZ";
	    
	    obj[1][0]="ABC";
	    obj[1][1]="ABC";
	    obj[1][2]="ABC";
	    
	    obj[2][0]="PQR";
	    obj[2][1]="PQR";
	    obj[2][2]="PQR";
	    
	   
	    
	    return obj;
    };
  
  @BeforeTest
  public void beforeTest() throws FileNotFoundException
  
  {
	  
	  f = new File("Z:\\Excel\\Datafile.xls");
	  fos=new FileOutputStream(f);
	  wb = new HSSFWorkbook();
	  sh = wb.createSheet("MyDataSheet");
  }

  @AfterTest
  public void afterTest() throws IOException
  
  {
	  wb.write(fos);
	  wb.close();
	  fos.close();
	  System.out.println("Done");
	
	  
  }

}
