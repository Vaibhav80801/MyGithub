package TestNG_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Main_Class {

	static WebDriver driver;
	public void LaunchAUT()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumData\\chromedriver_win32 (1)\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
	public static WebDriver getdriver()
	{
		return driver;
	}
	@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}
	
	
}
