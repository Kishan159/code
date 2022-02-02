package com.crm.SDET.Practice;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtils.ExcelUtility;
import com.crm.comcast.GenericUtils.FileUtility;



/**
 * 
 * @author Admin
 *
 */

public class creatingAccount {
	@Test 
	public void createContact() throws Throwable {
		//Random Data
		Random random = new Random();
		int randomNum = random.nextInt(100);

		//read data from Property File
		FileUtility fLib = new FileUtility();
		String BROWSER = fLib.readDataFromPropertyFile("browser");
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");

		//reading data from Excel
		ExcelUtility exc = new ExcelUtility();
		String contactName = exc.readStringDataFromExcel("Sheet3",0, 0)+randomNum;
		String mobileNumber = exc.readStringDataFromExcel("Sheet3",0, 1);
		
		//creating Global Object for driver
		WebDriver driver = null ;

		//Launching the browser
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}else {
			System.out.println("Invalid Browser Argument");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		//navigating to URL
		driver.get(URL);

		//login to Application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		//creating contact
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		driver.findElement(By.name("lastname")).sendKeys(contactName);
		driver.findElement(By.id("mobile")).sendKeys(mobileNumber);
		driver.findElement(By.xpath("//input[@name=\"assigntype\"][2]")).click();
		WebElement rv = driver.findElement(By.name("assigned_group_id"));
		
		Select select = new Select(rv);
		select.selectByVisibleText("Team Selling");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
    	action.moveToElement(ele).perform();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign Out"))));
    	driver.findElement(By.linkText("Sign Out")).click();
  }
}