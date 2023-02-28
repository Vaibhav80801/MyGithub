package TestNG_1;

import org.testng.annotations.Test;

public class ClassName_2 {
    @Test
	public void LaunchAUT()
	{
		System.out.println("This is Launch the Browser");
	}
    @Test
    public void Senddata()
    {
    	System.out.println("Enter the Values");
    }
    @Test
    public void Click_on_Login()
    {
    	System.out.println("Click on Login Button");
    }
    @Test
    public void Logout()
    {
    	System.out.println("Tear down");
    }
}
