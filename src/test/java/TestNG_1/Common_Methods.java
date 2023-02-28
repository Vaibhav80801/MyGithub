package TestNG_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Common_Methods extends Script_Salesforce {

	@Test
	public void Senddata() throws InterruptedException 
	{
		driver.findElement(By.id("username")).sendKeys("anilkumartesting57@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys("dytdtdct");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Login")).click();
	}
	
	public void Send_data_Amazon() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
}
