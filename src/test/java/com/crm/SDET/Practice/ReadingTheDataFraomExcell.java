package com.crm.SDET.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadingTheDataFraomExcell {
	
@Test

public void readingTheDataFromExcell() throws Throwable {
	FileInputStream fis = new FileInputStream("./data/testData.xlsx");
	Workbook work = WorkbookFactory.create(fis);
	 String url = work.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	 String browser = work.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	 String username = work.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	 String password = work.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
     String companyname = work.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
           Date date = work.getSheet("Sheet1").getRow(3).getCell(0).getDateCellValue();
      boolean alphabet = work.getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
        double number = work.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
     
     System.out.println(url);
     System.out.println(browser);
     System.out.println(username);
     System.out.println(password);
     System.out.println(companyname);
     System.out.println(date);
     System.out.println(alphabet);
     System.out.println(number);
}

}
