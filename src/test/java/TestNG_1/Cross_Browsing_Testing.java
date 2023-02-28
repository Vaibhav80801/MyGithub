package TestNG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//import org.testng.annotations.Parameters;

public class Cross_Browsing_Testing {

	WebDriver driver;
	
   @Parameters("browser")
	@BeforeMethod
	public void LaunchAUT(String browser)
	{
		switch(browser.toLowerCase())
		{
		case"chrome":
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumData\\chromedriver_win32 (1)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		break;
		case"fire":
	    System.setProperty("webdriver.gecko.driver","C:\\SeleniumData\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		break;
		case"edge":
		System.setProperty("webdriver.edge.driver","C:\\SeleniumData\\edgedriver_win64\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		default:
			driver=null;
			break;
	}
   }
	@Test
	public void GetTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(enabled=false)
	public void Senddata() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Anil Kumar");;
	    Thread.sleep(2000);
	    driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Test
	public void Send_info()
	{
	    WebElement we=driver.findElement(By.id("username"));
	    we.sendKeys("anilkumartesting22@gmail.com");
	    WebElement pass =driver.findElement(By.id("password"));
	    pass.sendKeys("abdsm123");
	    driver.findElement(By.id("Login")).click();
	}
	@AfterClass
	public void tear_down() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
