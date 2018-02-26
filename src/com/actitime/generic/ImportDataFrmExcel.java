package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ImportDataFrmExcel {

	
		//filenotfound exception-by fileinputstream
		//EncryptedDocumentException and InvalidFormatException by  WorkbookFactory

		public static void main(String[] args) throws Exception {
			//to create and read file
			 File file = new File("./data/input.xlsx");
			 FileInputStream fis = new FileInputStream(file);
			 //create workbook
			 Workbook wb = WorkbookFactory.create(fis);
			 //create sheet
		     Sheet sh = wb.getSheet("Sheet1");
		     //to get row count
		     int rc = sh.getLastRowNum();
		    //to get row
		     System.out.println(rc);
		     Row r = sh.getRow(0);
		     //to get cell
		     Cell c = r.getCell(0);
		     //to get the cell count
		     short cc = r.getLastCellNum();
		     System.out.println(cc);
		     //to get data
		     String data = c.getStringCellValue();
		     System.out.println(data);
		     
			 
			 

		}

	}


