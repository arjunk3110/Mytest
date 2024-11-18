package Capture_Screenshot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Base.LaunchQuitBrowser;

public class TestcaseVerify extends LaunchQuitBrowser
{
	@Test
	public void LaunchApp()
	{
		
	
	 driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
	 driver.findElement(By.id("user-message")).sendKeys("India");
	  driver.findElement(By.xpath("  //button[@id='showInput'] ")).click();	  
	  
	  String ActualMessage=driver.findElement(By.id("message")).getText();
	  Assert.assertEquals(ActualMessage, "India00","The message displayed is not as expected.");
	  
	 
	}

}
