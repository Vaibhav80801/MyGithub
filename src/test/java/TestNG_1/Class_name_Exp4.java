package TestNG_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_name_Exp4 {

	@BeforeMethod
	public void LaunchAUT()
	{
		System.out.println("Launch the Application");
	}
	@Test
	public void Senddata()
	{
		System.out.println("Send the Data");
	}
	@Test
	public void Send_Username()
	{
		System.out.println("Enter the Username");
	}
	@Test
	public void Send_Password()
	{
		System.out.println("Enter the Password");
	}
	@Test
	public void Get_Text()
	{
		System.out.println("Print the Text");
	}
	@AfterMethod
	public void Logout()
	{
		System.out.println("Click on Login Button");
	}
	
	
}
