package com.excelhandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		File file= new File("D:\\newfile.xlxs");
		if (file.exists())
		{
			
			
		}
		else
		{
			
			file.createNewFile();
		}

		System.out.println("File Created");
		System.out.println("File Created2");
		System.out.println("File Created3");
		System.out.println("File Created4");
		System.out.println("File Created4");
		

	}

}
