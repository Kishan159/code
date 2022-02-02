package com.crm.SDET.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Outputstream {
@Test

public void writingDataToExcel() throws Throwable {
	FileInputStream fis = new FileInputStream("./data/testData.xlsx");
	Workbook work = WorkbookFactory.create(fis);
	Cell sheet = work.getSheet("sheet1").getRow(0).createCell(4);
	sheet.setCellValue("Company Name");
	Cell sheet1 = work.getSheet("sheet1").getRow(1).createCell(4);
    sheet1.setCellValue("TYSS");
	
	FileOutputStream fos = new FileOutputStream("./data/testData.xlsx");
	work.write(fos);
	work.close();
	
	
}

}
