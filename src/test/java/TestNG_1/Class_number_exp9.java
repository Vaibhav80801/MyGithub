package TestNG_1;

import org.testng.annotations.Test;

public class Class_number_exp9 {

	@Test(priority=0)
	public void LaunchAut()
	{
		System.out.println("Launch the Application URL");
	}
	@Test(groups="Retesting")
	public void Senddata()
	{
		System.out.println("Enter the valid username and password");
	}
	@Test(groups="Regrassion")
	public void Get_Text()
	{
		System.out.println("Get the Text msg");
	}
	@Test(priority=1)
	public void Click_on_Login()
	{
		System.out.println("Click on Login Button");
	}
	
	
}
