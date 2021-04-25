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

public class CreateExcel

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
	  sh = wb.createSheet("MySheet");
	  rw = sh.createRow(0);
	  cl = rw.createCell(0);
	  cl.setCellValue("MyCell");
	  wb.write(fos);
	  wb.close();
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException 
  {
	  f = new File("Z:\\Excel\\newfile.xls");
	  fos=new FileOutputStream(f);
  }

  @AfterTest
  public void afterTest() throws IOException 
  
  
  {
	  System.out.println("Done");
	  fos.close();
	  
  }
  
  

}
