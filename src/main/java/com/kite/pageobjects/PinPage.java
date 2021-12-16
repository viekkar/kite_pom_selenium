package com.kite.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.kite.base.BaseClass;


public class PinPage extends BaseClass 
{
	
	

	@FindBy(xpath="//input[@id='pin']")
	WebElement pincode;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement pinbutton;
	
	
	public PinPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	
	public void pinEnter(String pin) {
		try{
			System.out.println(driver.getTitle());
		System.out.println(pin);
		//Thread.sleep(5000);
		pincode.sendKeys(pin);
		pinbutton.click();
		System.out.println(driver.getTitle());
		//return new Dashboard();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}  

}
