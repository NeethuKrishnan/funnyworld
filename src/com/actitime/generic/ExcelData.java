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

public class ExcelData {

	//to get the data
	
	public static String getData(String path,String sheetName,int rownum,int cellnum)
	{
	try{	
		 File file = new File(path);
	     FileInputStream fis = new FileInputStream(file);
	     Workbook wb = WorkbookFactory.create(fis);
	     Sheet sh = wb.getSheet(sheetName);
	     Row r = sh.getRow(rownum);
	     Cell cell = r.getCell(cellnum);
	     String data = cell.toString();
	     return data;
	     
	}
	catch(Exception e)
	{
	return" ";	
	}
	
	}
	//to get Row count
	
public static int rowCount(String path,String sheetName,int rowcount)
{
	
	
	try{
		
	
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
    Workbook wb = WorkbookFactory.create(fis);
     Sheet sh = wb.getSheet(sheetName);
    int rowcount1 = sh.getLastRowNum();
    return rowcount1;
    
	}
	
	catch(Exception e)
	{
		return 0;
	}
    
	

}
//to get cell count
public static int getCellCount(String path,String sheetName,int rownum ) 
{
	
	try{
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	
	Workbook wb = WorkbookFactory.create(fis);
    Sheet sh = wb.getSheet(sheetName);
     Row r = sh.getRow(rownum);
    int cellcount = r.getLastCellNum();
    
	return cellcount;
	}
	catch(Exception e)
	{
		return 0;
	}
	}
	

}
