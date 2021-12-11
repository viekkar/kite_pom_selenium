package com.kite.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kite.base.BaseClass;

public class CredentialsTest extends BaseClass{
	com.kite.pageobjects.CredentialsPage CredentialsPage;
	public  WebDriver driver;
	@BeforeMethod
	public void setup() {
	this.driver=lunchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.manage().deleteAllCookies();
	}
	
	
	@Test
	public void logging() throws Throwable {
		
		CredentialsPage= new com.kite.pageobjects.CredentialsPage(driver);
		CredentialsPage.clickOnSignIn();
	}
	

}
