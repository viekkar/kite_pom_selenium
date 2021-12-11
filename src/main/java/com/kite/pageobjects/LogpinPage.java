package com.kite.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.kite.base.BaseClass;

public class LogpinPage extends BaseClass {
	@FindBy(id="pin")
	WebElement pin;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/button")
	WebElement pinbtn;
	
	public LogpinPage() {
		PageFactory.initElements(driver, this);
	}
	

	public Dashboard goToDash () throws Throwable {
		pin.clear();
		String pincode =prop.getProperty("pin");
		pin.sendKeys(pincode);
		pinbtn.click();
		return new Dashboard();
	}


	public static void clickOnSignIn() {
		
	}
		

}
