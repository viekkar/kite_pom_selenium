package com.kite.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.kite.base.BaseClass;


public class PinPage extends BaseClass {
	

	@FindBy(id="pin")
	WebElement pincode;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/button")
	WebElement pinbutton;
	
	
	public PinPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	
	public Dashboard pinEnter(String pin) {
		System.out.println(driver.getTitle());
		System.out.println(pin);
		pincode.sendKeys(pin);
		pinbutton.click();
		System.out.println(driver.getTitle());
		return new Dashboard();
	}  

}
