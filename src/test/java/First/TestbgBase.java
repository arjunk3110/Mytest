package First;

import org.testng.annotations.Test;

public class TestbgBase{
	

	
@Test(priority=2)
	public void logintest() 
		{
			System.out.println("First Login test for testng");
		}

@Test(priority=1)
public void logouttest() 
{
	System.out.println("First Logout test for testng");
}

	
}
