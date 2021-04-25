package com.testng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExcelTable

{
	File f;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	
	
  @Test
  public void WriteToExcel() throws IOException 
  {
	  wb = new HSSFWorkbook();
	  sh = wb.createSheet("MySheet1");
	 
	  
	  for(int r=0;r<100;r++)
	  
	  {
		  rw = sh.createRow(r);
		  
		  for(int c=0;c<100;c++)
				
			{
			 
			  cl = rw.createCell(c);
			  cl.setCellValue("R"+r+"C"+c);
			 
		
			}  
		  
	  }
	  
	  
	 
	  wb.write(fos);
	  wb.close();
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException 
  {
	  f = new File("Z:\\Excel\\Hundred1file.xls");
	  fos=new FileOutputStream(f);
  }

  @AfterTest
  public void afterTest() throws IOException 
  
  
  {
	  System.out.println("Done");
	  fos.close();
	  
  }
  
  

}
