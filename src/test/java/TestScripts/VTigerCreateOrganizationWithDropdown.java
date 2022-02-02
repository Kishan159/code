package TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtils.ExcelUtility;
import com.crm.comcast.GenericUtils.FileUtility;


public class VTigerCreateOrganizationWithDropdown {

	@Test
	public void createOrganizationByChoosingEdcationinIndustryDropdown() throws IOException, InterruptedException {

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

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//navigating to URL
		driver.get(URL);

		//login to Application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click(); 
		Thread.sleep(5000);
		
		ExcelUtility exc = new ExcelUtility();
		String orgName = exc.readStringDataFromExcel("Sheet2", 0, 1);
		String dropdownName = exc.readStringDataFromExcel("Sheet2", 1,0 );
		
		//create Organization
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName);

		//selecting the Education Dropdown		
		
		WebElement industryDropdown = driver.findElement(By.name("industry"));
		Select select = new Select(industryDropdown);
		select.selectByVisibleText(dropdownName);
		driver.findElement(By.name("button")).click();

		//logout from the application
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		actions.moveToElement(ele).perform();
		driver.findElement(By.linkText("Sign Out")).click();

		//quitting the selenium session
		driver.quit();
	}
}
