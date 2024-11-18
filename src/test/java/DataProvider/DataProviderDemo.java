package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider(name="create")
	public Object[][] dataset()
	{
		return new Object[][]{
		{"Arjun","Password1"},
		{"Biku","Password2"}};
	}
	
	
	
	@Test(dataProvider="create")
	public void logintest(String UserName,String Password)
	{
	System.out.println("Username is "+UserName);
	System.out.println("Password is "+Password);
	}

		
	
	

	
}
