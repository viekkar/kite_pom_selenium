package com.kite.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.kite.base.BaseClass;
import com.kite.pageobjects.LoginPage;

public class LoginPageTest extends BaseClass {
	@BeforeMethod
	public void setup() {
		lunchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.manage().deleteAllCookies();
	}
	
	
	@Test
	
	public void verifyTitle() {
		String title=LoginPage.getKiteTitle();
		Assert.assertEquals(title, "Kite - Zerodha's fast and elegant flagship trading platform");

	}
		
}
	

