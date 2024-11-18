package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	  public static WebDriver driver;
		public static String browser="Firefox";
	  
	@BeforeMethod
	public void Setup () 
	{

		if (browser.equals("Chrome"))
	    	{
	    	driver=new ChromeDriver();	
	    	}
	    	
	    	else if(browser.equals("Firefox"))
	    	{
	    		driver=new FirefoxDriver();	
	    	}
	    }
	
	
	@Test
	public void website()
	{
		 driver.get("https://www.saucedemo.com/");
		 System.out.println("Website Openend");
	}
	
	
		
	@AfterMethod
	public void closeBrowser()
	{
		 if (driver != null){
	            driver.quit();
	}
		
		
	}
}

