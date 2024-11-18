package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertion
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
       
       SoftAssert SAssert = new SoftAssert();
       
       String ExpectedTitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
       String ExpectedText="Search";
       
		String ActualTile=driver.getTitle();
		SAssert.assertEquals(ActualTile, ExpectedTitle);
		System.out.println("TITLE VERIFIED");
		
		
		String ActualText= driver.findElement(By.xpath(" //*[@id=\"gh-btn\"] ")).getAttribute("value");	
		SAssert.assertEquals(ActualText, ExpectedText);
		System.out.println("TEXT VERIFIED");
		

	
		driver.quit();
		
		 SAssert.assertAll();
		
		
	}
}
