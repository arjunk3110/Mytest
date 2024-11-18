package Execute_Failed_TC;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.LaunchQuitBrowser;


public class Demo_Listener extends LaunchQuitBrowser{
	
	@Test(retryAnalyzer = Base.Retry.class)
	public void login(){
		
		driver.get("https://www.saucedemo.com/");
		Assert.assertTrue(false);
		
	}

}
