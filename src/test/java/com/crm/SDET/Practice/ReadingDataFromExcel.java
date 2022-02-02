package com.crm.SDET.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {

@Test
public void readDataFromExcel() throws  Throwable {
	FileInputStream fis = new FileInputStream("./data/testData.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	String work = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(work);
}

}
