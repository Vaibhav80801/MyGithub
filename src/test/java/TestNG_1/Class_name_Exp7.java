package TestNG_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class_name_Exp7 {

	@BeforeClass
	public void LaunchAUT()
	{
	   System.out.println("Launch the Application");
	}
	@Test(priority=2,enabled=false)
	public void Senddata()
	{
		System.out.println("Send the data");
	}
	@Test(priority=1)
	public void send_username()
	{
		System.out.println("Enter the Username");
	}
	@Test
	public void Get_Text()
	{
		System.out.println("Print the Text");
	}
	@AfterClass
	public void Click_on_Login()
	{
		System.out.println("Click on Login Button");
	}
	
	
}
