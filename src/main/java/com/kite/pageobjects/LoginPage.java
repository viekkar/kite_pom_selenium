package com.kite.pageobjects;
import com.kite.base.BaseClass;


public class LoginPage extends BaseClass {
	public static String getKiteTitle() {
		String kiteTitle=driver.getTitle();
		return kiteTitle;
	}
	
}
