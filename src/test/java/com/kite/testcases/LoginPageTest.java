package com.kite.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.kite.base.BaseClass;
import com.kite.pageobjects.LoginPage;
import com.kite.pageobjects.PinPage;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	PinPage pinPage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		lunchApp();
		loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void validateLoginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Kite - Zerodha's fast and elegant flagship trading platform");
	}
	@Test(priority=2)
	public void validateKiteLogoTest() {
		boolean flag=loginPage.validateKiteLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		pinPage=loginPage.Login(prop.getProperty("userid"),prop.getProperty("password"));
		
	}
		

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

		
}
	

