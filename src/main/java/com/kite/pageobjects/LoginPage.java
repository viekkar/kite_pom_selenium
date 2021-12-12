package com.kite.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.kite.base.BaseClass;
public class LoginPage extends BaseClass {
	
	//page objects using pagefactory method
	@FindBy(xpath="//*[@id='userid']")
	WebElement clintid;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div/div/form/div[4]/button")
	WebElement btn;
	
	@FindBy(xpath="//*[@id=\'outer-base\']")
	WebElement logo;
	//initializing of page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	
	//actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateKiteLogo() {
		return logo.isDisplayed();
	}
	public PinPage Login(String userid, String password) {
		clintid.sendKeys(userid);
		pwd.sendKeys(password);
		btn.click();
		
		return new PinPage();
	}



}

