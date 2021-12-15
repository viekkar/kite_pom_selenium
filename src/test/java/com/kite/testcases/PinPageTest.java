package com.kite.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.kite.base.BaseClass;
import com.kite.pageobjects.Dashboard;
import com.kite.pageobjects.LoginPage;
import com.kite.pageobjects.PinPage;

public class PinPageTest extends BaseClass {
	LoginPage loginPage;
	PinPage pinPage;
	Dashboard dashboard;
	
	public PinPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		lunchApp();
		loginPage=new LoginPage();
		loginPage.Login(prop.getProperty("userid"), prop.getProperty("password"));


	
	}
	
	@Test
	public void pinEnterTest(){
		
		pinPage=new PinPage();
		pinPage.pinEnter(prop.getProperty("pin"));
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.manage().window().fullscreen();
	}

}
