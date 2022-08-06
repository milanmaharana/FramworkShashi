package com.autodesk.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Milan
 *
 */
public class ExcelUtility {
	/** 
	 * This Method Helps to get Values From Excel Files
	 * 
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return String :Cell Values
	 * @throws Throwable
	 */
	public String getExcelCellData(String sheet,int row,int cell) throws Exception {
		FileInputStream fis=new FileInputStream(IpathConstant.Excel_Filepath);
		Workbook book=WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		
		return df.formatCellValue(book.getSheet(sheet).getRow(row).getCell(cell));
	}
	
	/** 
	 * This Method Helps to get LastRowNumber
	 * @param path
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 */
	public int getRowCount(String path,String sheetName) throws Throwable {
		FileInputStream fis  = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		wb.close();
		return sh.getLastRowNum();
	}
	
	/**
	 * This Method Helps to set a Data in Excel Files
	 * @param path
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @param data
	 * @throws Throwable
	 */
	public void setDataExcel(String path,String sheetName , int rowNum, int celNum ,String data) throws Throwable {
		FileInputStream fis  = new FileInputStream(IpathConstant.Excel_Filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}

}
