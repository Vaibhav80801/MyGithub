package TestNG_1;

import org.testng.annotations.Test;

public class Script_Salesforce extends Main_Class{

	@Test
	public void Salesforce() throws InterruptedException
	{
		Common_Methods obj=new Common_Methods();
	    //obj.Senddata();
		obj.Send_data_Amazon();
	}
	
}
