package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Sel
{
	 public static String browser = "Chrome";
	 public static WebDriver driver;
	    
	
	@Test
	public void VerifyTitlet()
	{
		if (browser.equals("Chrome"))
		{
            driver = new ChromeDriver();
            
        } 
		else if (browser.equals("Firefox"))
		{
            driver = new FirefoxDriver();
        }

		
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        
        String ExpectedTitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String ActualTile=driver.getTitle();
		
		Assert.assertEquals(ActualTile, ExpectedTitle);
		driver.close();
	}
}
