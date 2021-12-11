package com.kite.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kite.base.BaseClass;

public class CredentialsPage extends BaseClass {
	
	@FindBy(xpath="//*[@id='userid']")
	WebElement clintid;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div/div/form/div[4]/button")
	WebElement btn;
	
	public CredentialsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	
	public LogpinPage clickOnSignIn() throws Throwable {
		String password =prop.getProperty("password");
		String userid =prop.getProperty("userid");
		System.out.println(userid);
		clintid.click();
		//driver.findElement(By.id("userid")).sendKeys("test");
		clintid.sendKeys(userid);
		pwd.click();
		pwd.sendKeys(password);
		btn.click();
		return new LogpinPage();
	}
}
