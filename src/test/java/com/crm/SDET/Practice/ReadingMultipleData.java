package com.crm.SDET.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class ReadingMultipleData {
	@Test
	public void readMultipleFromExcel() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("./data/multipleData.xlsx");
		
	}

}
