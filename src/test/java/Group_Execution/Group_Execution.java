package Group_Execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group_Execution

{
	
	@Test  (groups="regression")
	public void FirstTC()
	{
		System.out.println("First Test Case is regression");
	}
		
	
	@Test(groups="Smoke")
	public void SecondTC()
	{
		System.out.println("Second Test Case is smoke");
	}
	

	@Test(priority=2,groups= {"regression","bvt"} )
	public void ThirdTC()
	{
		System.out.println("Third Test Case is regression and BVT");
		
	}
	
	@Test(priority=1,groups= "bvt" )
	public void FourthTC()
	{
		System.out.println("Fourth Test Case is BVT");
		
	}
	
}
