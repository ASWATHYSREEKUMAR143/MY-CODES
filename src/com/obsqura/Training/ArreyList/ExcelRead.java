package com.obsqura.Training.ArreyList;
import java.io.File;  
import java.io.FileInputStream; 
import java.util.ArrayList;
import java.util.Iterator;  
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class ExcelRead {

	public static void main(String[] args)   
	{  
	List l=new ArrayList<Double>();	
	try  
	{ 
		
	File file = new File("C:\\Users\\ammu0\\Desktop\\Book1.xlsx");   //creating a new file instance  
	FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
	//creating Workbook instance that refers to .xlsx file  
	XSSFWorkbook wb = new XSSFWorkbook(fis);   
	XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
	Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
	while (itr.hasNext())                 
	{  
	Row row = itr.next();  
	Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
	while (cellIterator.hasNext())   
	{  
	Cell cell = cellIterator.next();  
	switch (cell.getCellType())               
	{  
	case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
	System.out.print(cell.getStringCellValue() + "\t\t\t");  
	break;  
	case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type  
	System.out.print(cell.getNumericCellValue() + "\t\t\t"); 
	l.add(cell.getNumericCellValue());
	break; 
	case Cell.CELL_TYPE_BOOLEAN:
		System.out.println(cell.getBooleanCellValue()+"\t\t\t");
		l.add(cell.getNumericCellValue());
	default:  
	}  
	}  
	System.out.println("");  
	}  
	}  
	catch(Exception e)  
	{  
	e.printStackTrace();  
	}  
	System.out.println(l);
	double principal=(Double) l.get(0);
	double rate=(Double) l.get(1);
	double year=(Double) l.get(2);
	
	double intrst=(principal*rate*year)/100;
	System.out.println("SIMPLE INTREST : "+intrst);
	}  
	}  