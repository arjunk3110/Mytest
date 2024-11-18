package Annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod
{
	
	@BeforeTest
	public void logintoapp()
	{
		System.out.println("BEFORE TEST -Login to application");
	}
	
	
	@AfterTest
	public void logoutapp()
	{
		System.out.println("AFTER TEST -Logout from application");
	}
	
	
	
	@Test
	public void Loginuser() {
		System.out.println("TEST METHOD 2");
		
	}
	
	@Test
	public void GuestUser() {
		System.out.println("TEST METHOD 1");
		
	}
	
	@Test
	public void logout() 
	{
System.out.println("TEST METHOD 3");		
	}
	
	
	@BeforeMethod
	public void DBconnected() {
		System.out.println("BEFORE METHOD  -DB connected");
		
	}
	
	@AfterMethod
	public void DBDisconnected() {
		System.out.println("AFTER METHOD -DB Disconnected");
		
	}

	
	
}
