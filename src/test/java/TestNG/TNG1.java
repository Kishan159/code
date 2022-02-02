package TestNG;

import org.testng.annotations.Test;

public class TNG1 {
	@Test (groups = "smoke")
	public void TNG() {
		System.out.println("Smoke1");
	}
		@Test (groups = "Regression")
		public void TNG2() {
			System.out.println("Regression1");
		}
			@Test (groups = "smoke")
			public void TNG3() {
				System.out.println("Smoke2");
			}
			@Test (groups = { "smoke","Regression"})
			public void TNG4() {
				System.out.println("Smoke and Regression");
			}
		}
	
