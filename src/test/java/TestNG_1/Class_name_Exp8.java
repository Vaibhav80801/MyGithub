package TestNG_1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class_name_Exp8 {

	
	@BeforeClass
	public void LaunchAUT()
	{
		System.out.println("Launch the Application");
	}
	@Test(priority=2,enabled=false)
	public void Senddata()
	{
		System.out.println("Send the Data");
	}
	@Test(priority=1,description="this is Username data")
	public void Send_Username()
	{
		System.out.println("Enter the Username");
	}
	@Test(priority=1)
	public void Send_Password()
	{
		System.out.println("Enter the Password");
	}
	@Test(priority=0)
	public void Click_on_Login()
	{
		System.out.println("Click on Login Button");
	}
}
