package TestNG_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sadbasic_Silver extends Main_Class{
	@Test(dataProvider="logindata")
	public void initial(String username,String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	public Object[][] logindata()
	{
		Object[][] data = new Object[2][2];
		data[0][0]="anilkumartrsting33@gmail.com";
		data[0][1]="mmfghhgv";
	    data[1][0]="anilkumartrsting57@gmail.com";
	    data[1][1]="vjhyyghgb";
		return data;
		
	}
	

}
