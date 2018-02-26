package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TableFormat {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
		int i;
		int j;
		//create file
		//import filejava.io
		File file = new File("./data/input.xlsx");
		//read file
		FileInputStream fis = new FileInputStream(file);
		
		//create workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//create sheet
		Sheet sh = wb.getSheet("Sheet2");
		
		for(i=0;i<=sh.getLastRowNum();i++ )
		{
			 Row r = sh.getRow(i);

			for(j=0;j<r.getLastCellNum();j++)
			{ 
				Cell cc = r.getCell(j);
				String data = cc.getStringCellValue();
				System.out.print(data+" ");
				
				}
			System.out.println();
			
			}
			
		}
	
		
		 
		
		
		
		
		

	}


