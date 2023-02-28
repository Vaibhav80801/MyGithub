package TestNG_1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class_name_Exp5 {

	@BeforeClass
	public void LaunchAUT()
	{
		System.out.println("Launch the Browser");
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
	@Test
	public void Click_on_Login()
	{
		System.out.println("Click on Login Button");
	}
	
	
	
}
