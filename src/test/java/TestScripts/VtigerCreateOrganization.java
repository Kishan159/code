package TestScripts;

import java.io.IOException;


import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtils.ExcelUtility;
import com.crm.comcast.GenericUtils.FileUtility;

/**
 * 
 * @author kishan
 *
 */

public class VtigerCreateOrganization {

	@Test
	public void createOrganization() throws IOException, InterruptedException {
		 
		//Random data
		Random random=new Random();
		int randomNum=random.nextInt(90);
		
		//read data from Property File
		FileUtility fLib = new FileUtility();
		String BROWSER = fLib.readDataFromPropertyFile("browser");
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		
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
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//navigating to URL
		driver.get(URL);
		
		//login to Application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click(); 
		ExcelUtility exc = new ExcelUtility();
		String orgName = exc.readStringDataFromExcel("Sheet2", 0, 0)+ randomNum ;
		
		//create Organization
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.name("button")).click();
		
		//logout from the application
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		actions.moveToElement(ele).perform();
		driver.findElement(By.linkText("Sign Out")).click();	
	}
}