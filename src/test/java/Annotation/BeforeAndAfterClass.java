package Annotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
public class BeforeAndAfterClass 

{
	@BeforeClass
	public void BeforeClass()
	{
		
		System.out.println("Chrome driver initialization - BEFORE CLASS");
	}
	
	@AfterClass
	public void AfterClass()
	{
		
		System.out.println("Chrome driver closing - AFTER CLASS");
	}
	
	
	@Test
	public void First()
	{
		
		System.out.println("This is first test case");
	}
	
	
	@Test
	public void Second()
	{
		
		System.out.println("This is second test case");
	}
	
	
	

}
