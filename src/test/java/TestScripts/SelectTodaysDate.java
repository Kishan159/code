package TestScripts;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectTodaysDate {

@Test
public void handlingCalenderPopUp() {
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com");
	
	Actions action=new Actions(driver);
	action.moveByOffset(0, 15).click().perform();
	
	driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	//String path=""
	
	
}

}
