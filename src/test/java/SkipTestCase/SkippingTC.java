package SkipTestCase;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTC
{
	
	@Test(enabled=false)
	public void AddCustomer()
	{
		System.out.println("Add Customer is skipped");
	}
	
	
	@Test
	public void DeleteCusotmer()
	{
		System.out.println("Delete Customer is skipped  forcefully");
		throw new SkipException("Skipping Forcefully");
		
	}
	
	
	@Test
	public void EditCusotmer()
	{
		System.out.println("Edit customer is added");
		
	}
	
	
	
	


}
