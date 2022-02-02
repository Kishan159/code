package com.crm.SDET.Practice;

import org.testng.annotations.Test;

public class ReadingTheDataFromCommandLineTest {
	@Test
	public void readTheData() {
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
