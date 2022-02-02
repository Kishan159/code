package TestScripts;

import java.util.Set;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtils.FileUtility;
/**
 * 
 * @author Admin
 *
 */


public class CreateContact {

	public class CreateContactByReports {
		@Test
		public void contactByRepory() throws Throwable
		{
			        FileUtility fis=new FileUtility();
					String browser = fis.readDataFromPropertyFile("browser");
					String url = fis.readDataFromPropertyFile("url");
					String username = fis.readDataFromPropertyFile("username");
					String password = fis.readDataFromPropertyFile("password");
					
					//launching the browser
					WebDriver driver=null;
					if(browser.equals("chrome"))
					{
						driver=new ChromeDriver();
					}
					else if(browser.equals("firefox"));
					{
						driver=new FirefoxDriver();
					}
					
					//enter the url
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.get(url);
					
					//enter the username and password
					driver.findElement(By.name("user_name")).sendKeys(username);
					driver.findElement(By.name("user_password")).sendKeys(password);
					driver.findElement(By.xpath( "//input[@type='submit']")).click();
					
					//create a contact and org
					driver.findElement(By.xpath("//a[text()='Contacts']")).click();
					driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
					
				//	driver.findElement(By.name("lastname")).sendKeys(lastname);
					driver.findElement(By.xpath("//input[@name='account_name']/../img")).click();
					
					//window switching
					String parent_id = driver.getWindowHandle();
					Set<String> all_id = driver.getWindowHandles();
					for(  String id:all_id)
					{
						if(!id.equals(parent_id))
						{
							driver.switchTo().window(id);
						}
					}
					
					driver.findElement(By.xpath("//a[text()='College']")).click();
					driver.switchTo().window(parent_id);
					driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
					WebDriverWait wait = new WebDriverWait(driver, 20);
					
					Actions act=new Actions(driver);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))));
					
					act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
					driver.findElement(By.xpath("//a[.='Sign Out']")).click();
					
					//driver.quit();
					
		}

	}
}
