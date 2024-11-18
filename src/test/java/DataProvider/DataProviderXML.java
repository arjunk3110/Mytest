package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class DataProviderXML 
{
	
	 public static String browser = "Chrome";
	 public static WebDriver driver;
	 
	  @BeforeMethod
	    public void BrowsersetUp() 
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
	
	  
	    @AfterMethod
	    public void CloseBrowser() 
	    {
	            driver.quit();
	    }

	 @Test
	 public void test()
	 {
		  driver.get("https://www.saucedemo.com/");
	 }

}
