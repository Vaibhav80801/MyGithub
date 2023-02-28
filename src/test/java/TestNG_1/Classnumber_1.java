package TestNG_1;

import org.testng.annotations.Test;

public class Classnumber_1 {

	@Test
	public void LaunchAUT()
	{
		System.out.println("This is Launch the Browser");
	}
	public void Senddata()
	{
		System.out.println("enter the values");
	}
	public void Click_on_Login()
	{
		System.out.println("Click on Login Button");
	}
	public void Logout()
	{
		System.out.println("tear down");
	}

}
