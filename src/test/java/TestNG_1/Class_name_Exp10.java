
package TestNG_1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_name_Exp10 {

	@Test
	public void LaunchAUT()
	{
		System.out.println("Launch the Application");
	}
	@BeforeTest
	public void GetPageSRC()
	{
		System.out.println("Get the Text");
	}
	
	
	
}
