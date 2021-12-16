package CodenUI;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.ThreadUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodenUIExmple {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://codenboxautomationlab.com/practice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getTitle();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/main/article/div/div[1]/div[1]/fieldset/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("india");
		Select drpcounty=new Select(driver.findElement(By.xpath("//*[@id=\'dropdown-class-example\']")));
		Thread.sleep(1000);
		drpcounty.selectByVisibleText("API");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]")).click();
		Thread.sleep(1000);
		String winHandleBefore = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		Thread.sleep(1000);
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();
		Thread.sleep(1000);
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    Thread.sleep(1000);
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(1000);
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("vishnu ekkar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/main/article/div/div[2]/div[3]/fieldset/legend")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='hide-textbox']")).click();
		driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();
		WebElement mouse=driver.findElement(By.id("mousehover"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse).build().perform();
		action.moveToElement(driver.findElement(By.linkText("top"))).click().build().perform();
		

		
	}

	
	
}
