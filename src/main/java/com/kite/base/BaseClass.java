package com.kite.base;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	

	@BeforeTest
	public static void loadConfig() throws IOException {
		try {
			prop = new Properties();
			FileInputStream ip= new FileInputStream(
					System.getProperty("user.dir")+"\\Configuration\\Config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver lunchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url=prop.getProperty("url");
		driver.get(url);
		return driver;
	}
}
