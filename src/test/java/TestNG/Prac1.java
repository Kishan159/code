package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Prac1 {
	
	@Test (retryAnalyzer=com.crm.comcast.GenericUtils.RetryAnayserIMP1.class)
	public void practiceTest()
	{
		System.out.println("First RetryAnalyser");
		Assert.fail();
	}
	@Test
	public void practiceTest1() {
		
		System.out.println("First RetryAnalyser1");
	}
}
